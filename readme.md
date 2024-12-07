# Приложения управления задачами на webflux

## Сущности

1. Проект (Project)
    - project_id
    - projectName
    - List<Task> tasks (1:N)
    - List<User> teams (N:N) -> project_id | user_id


2. Задача (Task)
    - task_id
    - taskName
    - description
    - taskStatus
    - User assignee (1:1)
    - createdAt


3. Статус Задачи (TaskStatus)
    - CREATED
    - IN_PROGRESS
    - DONE


4. Пользователь (User)
    - user_id
    - username
    - password
    - UserRole role


5. Роль пользователя (UserRole)
    - ROLE_USER
    - ROLE_ADMIN

## Описание функциональности

1. Project:
    - создание проекта
    - обновление проекта
    - удаление проекта (задач связанных с ним)
    - получение проекта


2. Task:
    - создание задачи
    - удаление задачи
    - обновление задачи
    - получение задач


3. User:
    - создание пользователя
    - удаление пользователя
    - обновление пользователя
    - получение пользователя

## Будущие изменения

- разбитие на микросервисы
- добавление реактивной аутентификации
- упаковка в docker