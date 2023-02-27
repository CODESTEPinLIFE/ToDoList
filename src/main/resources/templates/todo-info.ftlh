<!DOCTYPE html>
<html>
<head>
    <title>ToDoList</title>
</head>
<body>
<h1>ToDoList</h1><hr>
<h4>Подробная информация о товаре</h4>
<b>Название задачи: </b>${product.title}<br>
<b>Описание задачи: </b>${product.description}<br>
<hr>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Удалить задачу"/>
</form>
</body>
</html>