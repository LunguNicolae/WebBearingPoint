<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>USER Page</title>

    
         <!--Bootstrap Core CSS--> 
    <link href="../style/css/bootstrap.min.css" rel="stylesheet">

     <!--MetisMenu CSS--> 
    <link href="../style/css/metisMenu.min.css" rel="stylesheet">

     <!--Custom CSS--> 
    <link href="../style/css/sb-admin-2.css" rel="stylesheet">

     <!--Custom Fonts--> 
    <link href="../style/css/font-awesome.min.css" rel="stylesheet" type="text/css">

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="../user/homePage">User PAGE</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" href="../logout.html">Logout</a>
                  
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                            </div>
                            <!-- /input-group -->
                        </li>
                        <li>
                            <a href="../user/projectPage">Project</a>
                        </li>
                        <li>
                            <a href="../user/taskPage">Task</a>
                        </li>         
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">USERS</h1>
                </div>
       
                      <table class="table table-hover">
                         <tr>
                            <th>#</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Username</th>
                            <th>Function</th>
                         </tr>
                      </table>

             </div>
             
             <!-- Indicates a successful or positive action -->
            <a class="btn btn-success" href="#" role="button">Add User</a>          
             
        </div>
        
   </div>

     <!--jQuery--> 
    <script src="../style/js/jquery.min.js"></script>

     <!--Bootstrap Core JavaScript--> 
    <script src="../style/js/bootstrap.min.js"></script>

     <!--Metis Menu Plugin JavaScript--> 
    <script src="../style/js/metisMenu.min.js"></script>

     <!--Custom Theme JavaScript--> 
    <script src="../style/js/sb-admin-2.js"></script>


</body>

</html>
