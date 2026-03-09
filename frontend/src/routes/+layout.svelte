<script lang="ts">
	import './layout.css';
	import favicon from '$lib/assets/favicon.svg';

	let { children } = $props();
</script>

<svelte:head><link rel="icon" href={favicon} /></svelte:head>
{@render children()}
<footer>
    <div class="contact-info">
        <p>📍 Calle Esperanza 123, Ciudad</p>
        <p>📞 +54 11 2345-6789</p>
        <p>✉️ contacto@refugiopatitas.org</p>
        <p>🕒 Lun a Vie 10:00 - 18:00</p>
    </div>
    <p>&copy; 2025 Refugio Patitas. Todos los derechos reservados.</p>
</footer>

<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        color: var(--text);
        line-height: 1.6;
        background-color: var(--background);
    }

    footer {
        background-color: var(--text);
        color: white;
        text-align: letf;
        padding: 2rem 0;
    }

    .footer-content p {
        margin: 0.5rem 0;
    }
</style>