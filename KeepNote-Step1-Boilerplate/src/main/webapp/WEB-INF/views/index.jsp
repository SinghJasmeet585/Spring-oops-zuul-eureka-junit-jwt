<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>KeepNote</title>
</head>
<body>
<h2>Keep Notes</h2>
<!-- Create a form which will have text boxes for Note ID, title, content and status along with a Send
    button. Handle errors like empty fields -->

<form method="POST" action="saveNote">
	<table>
		<tr>
			<td><label name="noteId">Note_id</label></td>
			<td><input name="noteId" /></td>
		</tr>
		<tr>
			<td><label name="noteTitle">Note_title</label></td>
			<td><input name="noteTitle" /></td>
		</tr>
		<tr>
			<td><label name="noteContent">Note_content</label></td>
			<td><input name="noteContent" /></td>
		</tr>
		<tr>
			<td><label name="noteStatus">Status</label></td>
			<td><input name="noteStatus" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Save Note" /></td>
		</tr>
	</table>
</form>
<!-- display all existing notes in a tabular structure with Id, Title,Content,Status, Created Date and Action -->
<hr />
<h2>List of Notes</h2>
<table border="1">
	<thead style="font-weight: bold">
	<td>Id</td>
	<td>Title</td>
	<td>Content</td>
	<td>Status</td>
	<td>createdOn</td>
	<td>Action</td>
	</thead>
<c:forEach var="note" items="${list}">
	<tr>
	<td>${note.getNoteId()}</td>
	<td>${note.noteTitle}</td>
	<td>${note.noteContent}</td>
	<td>${note.noteStatus}</td>
	<td>${note.createdAt}</td>
	<td><form action="deleteNote" method="post">
	<input type="hidden" id="noteId" name="noteId"
	value="${note.noteId}" />
	<button type="submit">Delete</button>
	</form></td>
	</tr>
	<br />
</c:forEach>

</table>
</body>
</html>

