     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <html>
         <head>
             <title>Samples List</title>
         </head>
         <body>
             <h1>Sample List</h1>

             <c:if test="${not empty samples}">
                 <table>
                     <thead>
                         <tr>
                             <th>Sample ID</th>
                             <th>Red Value</th>
                             <th>Green Value</th>
                             <th>Brightness</th>
                             <th>Status</th>
                             <th>Timestamp</th>
                         </tr>
                     </thead>
                     <tbody>
                         <c:forEach var="sample" items="${samples}">
                             <tr>
                                 <td>${sample.sampleId}</td>
                                 <td>${sample.red}</td>
                                 <td>${sample.green}</td>
                                 <td>${sample.brightness}</td>
                                 <td>${sample.classification}</td>
                                 <td>${sample.timestamp}</td>
                             </tr>
                         </c:forEach>
                     </tbody>
                 </table>
             </c:if>

             <c:if test="${empty samples}">
                 <p>No samples available.</p>
             </c:if>

             <a href="/sample-form">Add New Sample</a>
         </body>
     </html>
