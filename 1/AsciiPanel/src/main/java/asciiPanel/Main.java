package asciiPanel;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {

    @Bean
    public AsciiPanel asciiPanel(){
        return new AsciiPanel();
    }
    
    @Bean
    public AsciiFont asciiFont(){
        return new AsciiFont();
    }

    @Bean
    public String fontFilename(){
        return "talryth_square_15x15.png";
        }

    @Bean
        public int width(){
            return 15;
        }

    @Bean
        public int height(){
            return 15;
        }

    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);

        AsciiPanel panel =  applicationContext.getBean(AsciiPanel.class);

        System.out.println(panel.getAsciiFont().getFontFilename());

        applicationContext.close();
        
    }
}
