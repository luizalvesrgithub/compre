package br.com.compre.renderquest.src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaReadFile {

	private ArrayList<String> artigoCompleto = new ArrayList<String>();
	private BufferedWriter bw = null;
	private FileWriter fw = null;
	
	private static Integer CONTA_ARTIGO = 0;

	public static void main(String[] args) throws IOException {
		JavaReadFile jrf = new JavaReadFile();

		String FILENAME = "C:\\EclipseOxigenio\\renderquest\\src\\latexformatado.txt";
		String fileName = "C:\\EclipseOxigenio\\renderquest\\src\\lei8069de90.txt";

		jrf.fw = new FileWriter(FILENAME);
		jrf.bw = new BufferedWriter(jrf.fw);
		// using Java 7 Files class to process small files, get complete file data
		// System.out.println("Usando File");
		// readUsingFiles(fileName, jrf);

		// using Scanner class for large files, to read line by line
		System.out.println("Usando Scanner");
		readUsingScanner(fileName, jrf);

		// read using BufferedReader, to read line by line
		System.out.println("Usando BufferedReader linha por linha");
		readUsingBufferedReader(fileName, jrf);
		//readUsingBufferedReaderJava7(fileName, StandardCharsets.UTF_8);
		readUsingBufferedReader(fileName, StandardCharsets.UTF_8);

		// read using FileReader, no encoding support, not efficient
		readUsingFileReader(fileName, jrf);
		try {

			if (jrf.bw != null)
				jrf.bw.close();

			if (jrf.fw != null)
				jrf.fw.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}
	}

	private static void readUsingFileReader(String fileName, JavaReadFile jrf) throws IOException {
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		System.out.println("Reading text file using FileReader");
		while ((line = br.readLine()) != null) {
			if (line.trim().startsWith("Art.")) {
				System.out.println(line);
			}
				
		}
		br.close();
		fr.close();

	}

	private static void readUsingBufferedReader(String fileName, Charset cs) throws IOException {
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis, cs);
		BufferedReader br = new BufferedReader(isr);
		String line;
		System.out.println("Read text file using InputStreamReader");
		while ((line = br.readLine()) != null) {
			// process the line
			System.out.println(line);
		}
		br.close();

	}

	private static void readUsingBufferedReaderJava7(String fileName, Charset cs) throws IOException {
		Path path = Paths.get(fileName);
		BufferedReader br = Files.newBufferedReader(path, cs);
		String line;
		System.out.println("Read text file using BufferedReader Java 7 improvement");
		while ((line = br.readLine()) != null) {
			// process the line
			System.out.println(line);
		}
		br.close();
	}

	private static void readUsingBufferedReader(String fileName, JavaReadFile jrf) throws IOException {
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		System.out.println("Read text file using BufferedReader");
		while ((line = br.readLine()) != null) {
			if (line.trim().startsWith("Art.")) {
				esvaziarListaArtigoCompleto(jrf);
			}
			jrf.setArtigoCompleto(line);
		}
		esvaziarListaArtigoCompleto(jrf);
		// close resources
		br.close();
		fr.close();
	}

	private static void readUsingScanner(String fileName, JavaReadFile jfr) throws IOException {
		Path path = Paths.get(fileName);
		Scanner scanner = new Scanner(path);
		System.out.println("Read text file using Scanner");
		// read line by line
		while (scanner.hasNextLine()) {
			// process each line
			String line = scanner.nextLine();
			if (line.trim().startsWith("Art.")) {
				esvaziarListaArtigoCompleto(jfr);
			}
			jfr.setArtigoCompleto(line);
			// System.out.println(line);
		}
		esvaziarListaArtigoCompleto(jfr);
		scanner.close();
	}

	private static void esvaziarListaArtigoCompleto(JavaReadFile jfr) {
		JavaReadFile.CONTA_ARTIGO++;
		try {
			jfr.bw.write("\\begin{artigo}");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Iterator<String> itartigo = jfr.artigoCompleto.iterator();
		while (itartigo.hasNext()) {
			String element = itartigo.next();
			try {
				jfr.bw.write(element+"\n");
			} catch (IOException ex) {
				ex.printStackTrace();
			}	
		}
		try {
			jfr.bw.write("\\end{artigo}\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jfr.artigoCompleto.clear();
	}

	private static void readUsingFiles(String fileName, JavaReadFile jfr) throws IOException {
		try {
			Path path = Paths.get(fileName);
			// read file to byte array
			byte[] bytes = Files.readAllBytes(path);
			System.out.println("Read text file using Files class");
			// read file to String list
			@SuppressWarnings("unused")
			List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
			System.out.println(new String(bytes));
		} catch (Exception e) {
			System.out.println("ead file to String list" + e.getMessage());
		}
	}

	public ArrayList<String> getArtigoCompleto() {
		return artigoCompleto;
	}

	public void setArtigoCompleto(String line) {
		this.artigoCompleto.add(line);
	}

}