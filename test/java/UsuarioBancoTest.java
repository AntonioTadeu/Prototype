package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioBancoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        UsuarioBanco UsuarioBanco = new UsuarioBanco(129, "Usuario Unico", new Endereco("Rua Jubal Samico", 205), "Vassouras");

        UsuarioBanco UsuarioBancoClone = UsuarioBanco.clone();
        UsuarioBancoClone.setMatricula(300);
        UsuarioBancoClone.setNome("Usuario Clonado");
        UsuarioBancoClone.getEndereco().setNumero(2);

        assertEquals("Aluno{matricula=129, nome='Usuario Original', endereco=Endereco{logradouro='Rua Jubal Samico', numero=205}, localNascimento='Vassouras'}", UsuarioBanco.toString());
        assertEquals("Aluno{matricula=300, nome='Usuario Clonado', endereco=Endereco{logradouro='Rua Jubal Samico', numero=205}, localNascimento='Vassouras'}", UsuarioBancoClone.toString());
    }
}