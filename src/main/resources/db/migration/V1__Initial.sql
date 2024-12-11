CREATE TABLE IF NOT EXISTS user_role (
    role_id BIGSERIAL PRIMARY KEY,
    role_name VARCHAR(128) NOT NULL
);

CREATE TABLE IF NOT EXISTS task_status (
    status_id BIGSERIAL PRIMARY KEY,
    status_name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS project (
    project_id BIGSERIAL PRIMARY KEY,
    project_name VARCHAR(1024) NOT NULL,
    description VARCHAR(1024) NOT NULL
);

CREATE TABLE IF NOT EXISTS users (
    user_id BIGSERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role BIGINT REFERENCES user_role(role_id) NOT NULL
);

CREATE TABLE IF NOT EXISTS task (
    task_id BIGSERIAL PRIMARY KEY,
    task_name VARCHAR(255) NOT NULL,
    description VARCHAR(1024),
    task_status BIGINT REFERENCES task_status(status_id) NOT NULL,
    assignee BIGINT REFERENCES users(user_id),
    created_at TIMESTAMP
);

CREATE TABLE IF NOT EXISTS teams (
    project_id BIGINT REFERENCES project(project_id),
    user_id BIGINT REFERENCES users(user_id),
    PRIMARY KEY (project_id, user_id)
);
