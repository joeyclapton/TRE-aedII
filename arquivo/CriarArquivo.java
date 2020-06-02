package arquivo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import moduloTRE.Eleitor;
import moduloTRE.Candidato;

public class CriarArquivo{
	
	public static void criarArquivoEleitor(String enderecoPasta, Eleitor[] eleitores) {

		//Criação de Subpasta
		File file = new File(enderecoPasta + "/saida/eleitores.txt");
		boolean sucesso = file.getParentFile().mkdirs();
		System.out.println("Subpasta criada com sucesso: " + sucesso);
						
		//Criar arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
			for (int i =0; i<eleitores.length; i++) {
				bw.write(eleitores[i].getNomeEleitor());
				bw.write(";");
				bw.write(eleitores[i].getTituloEleitor());
				bw.write(";");
				bw.write(eleitores[i].getMunicipioEleitoral());
				bw.write(";");
				bw.write(eleitores[i].getZonaEleitoral());
				bw.write(";");
				bw.write(eleitores[i].getSecaoEleitoral());
				bw.newLine();
			}
		}
		catch(IOException excecao) {
			excecao.printStackTrace();
		}
	}
	
	public static void criarArquivoCandidato(String enderecoPasta, Candidato[] candidatos) {

		//Criação de Subpasta
		File file = new File(enderecoPasta + "/saida/candidatos.txt");
		boolean sucesso = file.getParentFile().mkdirs();
		System.out.println("Subpasta criada com sucesso: " + sucesso);
						
		//Criar arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
			for (int i =0; i<candidatos.length; i++) {
				bw.write(candidatos[i].getNomeCandidato());
				bw.write(";");
				bw.write(candidatos[i].getNumeroCandidato());
				bw.write(";");
				bw.write(candidatos[i].getNomeMunicipioCandidato());
				bw.write(";");
				bw.write(candidatos[i].getSiglaPartido());
				bw.write(";");
				bw.write(candidatos[i].getCargo());
				bw.newLine();
			}
		}
		catch(IOException excecao) {
			excecao.printStackTrace();
		}
	}
	
	/*public static void criarArquivo(String enderecoPasta, String nomeArquivo, Objeto[] objetos) {

		//Criação de Subpasta
		File file = new File(enderecoPasta + nomeArquivo);
		boolean sucesso = file.getParentFile().mkdirs();
		System.out.println("Subpasta criada com sucesso: " + sucesso);
						
		//Criar arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
			for (int i =0; i<objetos.length; i++) {
				bw.write(dados[i]+";");
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}*/

	
}