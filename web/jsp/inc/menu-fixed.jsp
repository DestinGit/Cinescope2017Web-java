<div class="container">

    <!-- Navbar brand -->
    <a class="navbar-brand" href="/Cinescope2017Web/">Navbar</a>

    <!-- Collapse button -->
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
            aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>

    <!-- Collapsible content -->
    <div class="collapse navbar-collapse" id="navbarSupportedContent">

        <!-- Links -->
        <ul class="navbar-nav mr-auto">          
            <li class="nav-item active">
                <a class="nav-link" href="#">Accueil<span class="sr-only">(current)</span></a>
            </li>
            
            <!-- Dropdown Films-->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLinkFilm" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Films</a>
                <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLinkFilm">
                    <a class="dropdown-item" href="/Cinescope2017Web/AllFilms">Tous les films</a>
                    <a class="dropdown-item" href="#">Avant-premières</a>
                    <a class="dropdown-item" href="#">Nouveaux films</a>
                    <a class="dropdown-item" href="#">Reprises</a>
                </div>
            </li>
            
<!--            <li class="nav-item"><a class="nav-link" href="#">Box office</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Hit parade</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Avis des critiques</a></li>-->
            
            <li class="nav-item"><a class="nav-link" href="#">Les articles</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Festivals</a></li>
            
            
             <!--Dropdown Classement-->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Classement</a>
                <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="#">Box office</a>
                    <a class="dropdown-item" href="#">Hit parade</a>
                    <a class="dropdown-item" href="#">Avis des critiques</a>
                </div>
            </li>
            <!-- Dropdown Salles -->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLinkSalles" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Salles</a>
                <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLinkSalles">
                    <a class="dropdown-item" href="#">Salles de Paris</a>
                    <a class="dropdown-item" href="#">Salle de la périphérie</a>
                </div>
            </li>

        </ul>
        <!-- Links -->

        <!-- Search form -->        
        <form class="form-inline">
            <input class="form-control mr-sm-2" type="text" placeholder="Rechercher" aria-label="Search">
            <!--<button class="btn btn-outline-success btn-sm my-0" type="submit">Search</button>-->
            <button class="btn btn-outline-primary btn-sm my-0" type="submit">Valider</button>
            
            <ul class="navbar-nav mr-auto">
                <li class="nav-item"><a class="nav-link" href="#">Recherche avancée</a></li>
            </ul>        
        </form>
    </div>
    <!-- Collapsible content -->

</div>