@Configuration
public class JteConfig {

    @Bean
    public TemplateEngine templateEngine() {
        return TemplateEngine.create(
                Paths.get("src/main/jte"),
                ContentType.Html
        );
    }
}
