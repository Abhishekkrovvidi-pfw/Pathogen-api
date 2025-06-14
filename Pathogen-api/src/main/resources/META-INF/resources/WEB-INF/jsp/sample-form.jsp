<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>New Sample Form</title>
    </head>
    <body>
        <h1>Add New Sample</h1>
        <form:form action="/samples" method="post" modelAttribute="sample">
            <label for="sampleId">Sample ID:</label>
            <form:input type="text" path="sampleId" id="sampleId" required="true" />

            <label for="red">Red Value:</label>
            <form:input type="number" path="red" id="red" required="true" />

            <label for="green">Green Value:</label>
            <form:input type="number" path="green" id="green" required="true" />

            <label for="brightness">Brightness:</label>
            <form:input type="number" path="brightness" id="brightness" required="true" />

            <label for="timestamp">Timestamp:</label>
            <form:input type="datetime-local" path="timestamp" id="timestamp" required="true" />

            <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>
