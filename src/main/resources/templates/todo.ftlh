<!DOCTYPE html>
<html>
<head>
    <title>ToDoList</title>
</head>
<body>
<h1>ToDoList</h1><hr>
<h4>Твои задачи</h4>
<#list todo as task>
    <div>
        <p><b>Задача: ${task.title}</b> Описание: ${task.description}  | <a href="/task/${task.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Создать новую задачу</h3>
<form action="/task/create" method="post">
    Название задачи: <input type="text" name="title"/><br><br>
    Описание задачи: <input type="text" name="description"/><br><br>
    <input type="submit" value="Добавить задачи"/>
</form>
</body>
</html>