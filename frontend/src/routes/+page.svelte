<!-- RefugioPatitas.svelte (versión con cards descriptivas) -->
<script>
  import Hero from "$lib/components/ui/Hero.svelte"
  import DogRescuedImg  from '$lib/assets/landing/pet_rescued.jpg'
</script>

<header>
  <div class="container header-container">
    <div class="logo">🐾 Refugio Patitas</div>
    <nav>
      <ul>
        <li><a href="#inicio">Inicio</a></li>
        <li><a href="#adoptar">Adoptar</a></li>
        <li><a href="#apoyar">Apoyar</a></li>
        <li><a href="#contacto">Contacto</a></li>
      </ul>
    </nav>
  </div>
</header>

<main>
  <!-- Hero -->
  <section id="inicio" class="hero">
    <div class="container hero-content">
      <h1>Dales una segunda oportunidad</h1>
      <p>Adopta amor incondicional, conoce a nuestros amigos que esperan un hogar.</p>
      <a href="#adoptar" class="btn">Ver adoptables</a>
    </div>
  </section>
  
    <Hero 
        title="Dales una segunda oportunidad" 
        description="Adopta amor incondicional, conoce a nuestros amigos que esperan un hogar."
        href="#adoptar"
        src= { DogRescuedImg }
        alt="a person adopting a dog"
    />

  <!-- Acerca del refugio (texto + estadísticas) -->
  <section class="about">
    <div class="container">
      <h2>Sobre nosotros</h2>
      <p>En Refugio Patitas trabajamos desde 2010 para rescatar, rehabilitar y encontrar hogares amorosos para perros y gatos abandonados. Creemos en la adopción responsable y en brindar una segunda oportunidad a quienes más lo necesitan.</p>
    </div>
  </section>

  <!-- NUEVA SECCIÓN: Cards describiendo el refugio -->
  <section class="refuge-cards">
    <div class="container">
      <h2>Nuestro refugio en detalle</h2>
      <div class="card-grid">
        <div class="card">
          <div class="card-icon">🎯</div>
          <h3>Misión</h3>
          <p>Rescatar, rehabilitar y reubicar animales abandonados, promoviendo la tenencia responsable.</p>
        </div>
        <div class="card">
          <div class="card-icon">🏥</div>
          <h3>Instalaciones</h3>
          <p>Contamos con consultorio veterinario, áreas de cuarentena, patios de juego y mucho más.</p>
        </div>
        <div class="card">
          <div class="card-icon">👥</div>
          <h3>Equipo</h3>
          <p>Un grupo de profesionales y voluntarios apasionados por el bienestar animal.</p>
        </div>
        <div class="card">
          <div class="card-icon">📋</div>
          <h3>Proceso de adopción</h3>
          <p>Entrevista, seguimiento y asesoramiento para asegurar una adopción exitosa.</p>
        </div>
      </div>
    </div>
  </section>

  <!-- Animales en adopción (cards de animales) -->
  <section id="adoptar" class="animals">
    <div class="container">
      <h2>Conoce a algunos de nuestros amigos</h2>
      <div class="animal-grid">
        <div class="card">
          <div class="card-img">🐕</div>
          <h3>Luna</h3>
          <p>Perra mestiza, 2 años, juguetona y cariñosa.</p>
        </div>
      </div>
    </div>
  </section>

  <!-- Cómo ayudar -->
  <section id="apoyar" class="help">
    <div class="container">
      <h2>¿Cómo puedes ayudar?</h2>
      <div class="help-grid">
        <div class="help-item">
          <div class="help-icon">💰</div>
          <h3>Donación</h3>
          <p>Tu aporte económico nos permite cubrir alimentos, vacunas y atención veterinaria.</p>
        </div>
        <div class="help-item">
          <div class="help-icon">🤝</div>
          <h3>Voluntariado</h3>
          <p>Únete a nuestro equipo para pasear perros, socializar gatos o ayudar en eventos.</p>
        </div>
        <div class="help-item">
          <div class="help-icon">🏡</div>
          <h3>Hogar temporal</h3>
          <p>Ofrece un espacio transitorio a un animal mientras encuentra su familia definitiva.</p>
        </div>
      </div>
    </div>
  </section>
</main>



<style>
  .container {
    width: 90%;
    max-width: 1200px;
    margin: 0 auto;
    padding: 0 15px;
  }

  /* Header */
  header {
    background-color: var(--white);
    box-shadow: var(--shadow);
    position: sticky;
    top: 0;
    z-index: 100;
  }

  .header-container {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 1rem 0;
    flex-wrap: wrap;
  }

  .logo {
    font-size: 1.5rem;
    font-weight: bold;
    color: var(--primary);
  }

  nav ul {
    list-style: none;
    display: flex;
    gap: 2rem;
  }

  nav a {
    text-decoration: none;
    color: var(--text);
    font-weight: 500;
    transition: color 0.3s;
  }

  nav a:hover {
    color: var(--primary);
  }


  .btn {
    display: inline-block;
    background-color: var(--white);
    color: var(--primary);
    padding: 0.8rem 2rem;
    border-radius: 50px;
    text-decoration: none;
    font-weight: 600;
    border: 2px solid transparent;
    transition: all 0.3s;
    cursor: pointer;
    border: none;
    font-size: 1rem;
  }

  .btn:hover {
    background-color: transparent;
    border: 2px solid var(--white);
    color: var(--white);
  }

  /* Secciones generales */
  section {
    padding: 4rem 0;
  }

  section h2 {
    text-align: center;
    font-size: 2rem;
    margin-bottom: 2rem;
    color: var(--text);
    position: relative;
  }

  section h2::after {
    content: '';
    display: block;
    width: 80px;
    height: 4px;
    background: var(--primary);
    margin: 0.5rem auto 0;
    border-radius: 2px;
  }

  /* About */
  .about p {
    text-align: center;
    max-width: 800px;
    margin: 0 auto 2rem;
  }

  .stat span {
    display: block;
    font-size: 1.8rem;
    font-weight: bold;
    color: var(--primary);
  }

  /* Refuge cards (nuevo estilo) */
  .refuge-cards {
    background-color: var(--light-gray);
  }

  .card-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
    gap: 2rem;
  }

  .card {
    background-color: var(--white);
    border-radius: 8px;
    overflow: hidden;
    box-shadow: var(--shadow);
    text-align: center;
    transition: transform 0.3s;
    padding: 1.5rem 1rem;
  }

  .card:hover {
    transform: translateY(-5px);
  }

  .card-icon {
    font-size: 3rem;
    margin-bottom: 1rem;
  }

  .card h3 {
    margin: 0 0 0.5rem;
    color: var(--primary-dark);
  }

  .card p {
    font-size: 0.95rem;
  }

  /* Animales grid (reutiliza .card pero con imagen) */
  .animals .card-img {
    height: 160px;
    background-color: var(--light-gray);
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 4rem;
    margin: -1.5rem -1rem 1rem -1rem; /* para que la imagen sobresalga */
    border-radius: 8px 8px 0 0;
  }

  .animals .card {
    padding: 0 0 1.5rem 0; /* reset padding para la imagen */
  }

  .animals .card h3 {
    margin-top: 0.5rem;
  }

  /* Help section */
  .help-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
    gap: 2rem;
    text-align: center;
  }

  .help-item {
    background-color: var(--white);
    padding: 2rem;
    border-radius: 8px;
    box-shadow: var(--shadow);
  }

  .help-icon {
    font-size: 3rem;
    margin-bottom: 1rem;
  }

  .help-item h3 {
    color: var(--primary);
    margin-bottom: 0.5rem;
  }

  /* Contacto */
  .contact-wrapper {
    display: grid;
    grid-template-columns: 1fr 1fr;
    gap: 2rem;
    background-color: var(--white);
    border-radius: 8px;
    box-shadow: var(--shadow);
    padding: 2rem;
  }

  .contact-info p {
    margin-bottom: 0.8rem;
    display: flex;
    align-items: center;
    gap: 0.5rem;
  }

  .contact-form {
    display: flex;
    flex-direction: column;
    gap: 1rem;
  }

  .contact-form input,
  .contact-form textarea {
    padding: 0.8rem;
    border: 1px solid var(--light-gray);
    border-radius: 4px;
    font-family: inherit;
  }

    @media (max-width: 768px) {
        .header-container {
            flex-direction: column;
            gap: 1rem;
        }

        nav ul {
            flex-wrap: wrap;
            justify-content: center;
            gap: 1rem;
        }
    
        .stats {
            flex-direction: column;
            align-items: center;
        }
    }
</style>