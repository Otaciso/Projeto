package projeto.lp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPrincipalTest {

	// Testa Pessoa.
	private Pessoa pessoa;
	private Endereco endereco;

	@Before
	public void criarPessoa() {
		try {
			endereco = new Endereco("Marta Jabs", 198, "Rocha", "Rio Tinto",
					"Paraiba");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		pessoa = new Pessoa("Otaciso", 25, "Masculino ", "078.059.234-42",
				"8.392.44", endereco);
	}

	@Test
	public void testPessoa() {
		Assert.assertEquals("Nome errado!", "Otaciso", pessoa.getNome());
	}

	// TetaEnmdere�o

	@Test
	public void criarEndere�o() throws Exception {
		endereco = new Endereco("Boa Hancok", 1234, "Aurora", "Campina grande",
				"Paraiba");
	}

	@Test
	public void testaLan�amentoDeExecoes() {

		try {
			new Endereco("", 1234, "Aurora", "Campina grande", "Paraiba");
			Assert.fail("Lan�a exe��o de nome com nome vazio");
		} catch (Exception e) {
			Assert.assertEquals("Mensagem Errada!", "Nome da rua Invalido",
					e.getMessage());
		}

		try {
			new Endereco(null, 1234, "Aurora", "Campina grande", "Paraiba");
			Assert.fail("Lan�a exe��o de nome com nome vazio");
		} catch (Exception e) {
			Assert.assertEquals("Mensagem Errada!", "Nome da rua Invalido",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", -1234, "Aurora", "Campina grande",
					"Paraiba");
			Assert.fail("Lan�a exe��o de nome vazio");
		} catch (Exception e) {
			Assert.assertEquals("Mensagem Errada!", "Nome da Rua Invalido",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", 1234, "", "Campina grande", "Paraiba");
			Assert.fail("Devia Lan�ar Exe��o Bairro Invalido!");
		} catch (Exception e) {
			Assert.assertEquals("Mensagem Errada!", "Nome do bairro Invalido",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", 1234, "Aurora", "", "Paraiba");
			Assert.fail("Devia Lan�ar Exe��o Cidade Invalido!");
		} catch (Exception e) {
			Assert.assertEquals("Mensagem Errada!", "Nome da Cidade Invalido",
					e.getMessage());
		}

		try {
			new Endereco("Boa Hancok", 1234, "Aurora", "Campina grande", "");
			Assert.fail("Devia Lan�ar Exe��o Estado Invalido!");
		} catch (Exception e) {
			Assert.assertEquals("Mensagem Errada!", "Nome do Estado Invalido!",
					e.getMessage());
		}
	}

	@Test(expected = Exception.class)
	public void testaConstrutorParamRuaNull() throws Exception {
		new Endereco(null, 1234, "Aurora", "Campina grande", "Paraiba");
	}

	@Test
	public void testaEndere�o() {

		Assert.assertEquals("Marta Jabs", endereco.getRua());
		Assert.assertTrue(198 == endereco.getNumero());
	}
	
	@Test
	public void testaToString(){
		//System.out.println(endereco.toString());
	}
}
