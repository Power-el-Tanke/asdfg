<script>
    let {title, description, src, alt, href} = $props();
</script>

<section class="hero card-border">
    <a {href}>
        <h2> {title} </h2>
        <img {src} {alt} height=240>
        <p> {description} </p>
    </a>
</section>

<style>
    .hero {
        background: linear-gradient(135deg, var(--white) 0%, var(--primary) 100%);
        color: white;
        text-align: center;
    }

    h2 {
        font-size: 2.5rem;
        margin-bottom: 1rem;
    }

    p {
        font-size: 1.2rem;
        margin-bottom: 2rem;
    }
</style>
