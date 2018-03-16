
import java.io.IOException;
import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GitHub;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pnocedalopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        GitHub github=GitHub.connect();
        GHCreateRepositoryBuilder builder;
        builder = github.createRepository("Repositorio creado desde NetBeans");
        builder.create();
    }
    
}
