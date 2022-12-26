
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Navigations Bar</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./css/commons.css" />
  </head>
  <body>
    <%@ page import="java.util.HashMap, java.util.ArrayList" %>
    <% 
        HashMap<String, String> searchForm01 = (HashMap<String, String>)request.getAttribute("searchForm"); 
    %>
    <%= searchForm01.get("search_key") %>
    <%! String url = "location.href= '/pollListServlet' "; %>
    <button class="btn btn-primary" onclick="<%= url%>">Next</button>

    <nav class="navbar navbar-expand bg-light">
      <div class="navbar-nav">
        <a href="" class="nav-link">Home</a>
        <a href="" class="nav-link">Feature</a>
        <a href="" class="nav-link">Pricing</a>
      </div>
    </nav>
  </body>
</html>
