package br.com.engenharia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TabelaDoTipoK {
	
	Collection<LinhaTabelaDoTipoKData> tabela = new ArrayList<LinhaTabelaDoTipoKData>();
	LinhaTabelaDoTipoKData data;
	
	public TabelaDoTipoK() {
		this.carregaTabelaK();
	}
	
	public void carregaTabelaK() {
		data = new LinhaTabelaDoTipoKData(0.01, 103.355, 82.684, 68.903, 59.06, 51.677, 45.935, 41.342, 0.046, 0.023, 0.019, 0.01);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.02, 51.886, 41.509, 34.59, 29.649, 25.943, 23.06, 20.754, 0.046, 0.023, 0.019, 0.02);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.03, 34.73, 27.784, 23.154, 19.846, 17.365, 15.436, 13.892, 0.047, 0.023, 0.019, 0.03);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.04, 26.154, 20.923, 17.436, 14.945, 13.077, 11.624, 10.462, 0.047, 0.023, 0.019, 0.04);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.05, 21.008, 16.807, 14.006, 12.005, 10.504, 9.337, 8.403, 0.047, 0.023, 0.02, 0.05);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.06, 17.579, 14.063, 11.719, 10.045, 8.789, 7.813, 7.032, 0.047, 0.024, 0.02, 0.06);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.07, 15.13, 12.104, 10.086, 8.645, 7.565, 6.724, 6.052, 0.047, 0.024, 0.02, 0.07);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.08, 13.293, 10.634, 8.862, 7.596, 6.647, 5.908, 5.317, 0.048, 0.024, 0.02, 0.08);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.09, 11.865, 9.492, 7.91, 6.78, 5.933, 5.273, 4.746, 0.048, 0.024, 0.02, 0.09);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.1, 10.723, 8.578, 7.149, 6.127, 5.362, 4.766, 4.289, 0.048, 0.024, 0.02, 0.1);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.11, 9.789, 7.831, 6.526, 5.594, 4.895, 4.351, 3.916, 0.048, 0.024, 0.02, 0.11);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.12, 9.011, 7.209, 6.007, 5.149, 4.505, 4.005, 3.604, 0.048, 0.024, 0.02, 0.12);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.13, 8.353, 6.682, 5.569, 4.773, 4.176, 3.712, 3.341, 0.049, 0.024, 0.02, 0.13);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.14, 7.789, 6.231, 5.193, 4.451, 3.895, 3.462, 3.116, 0.049, 0.024, 0.02, 0.14);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.15, 7.301, 5.841, 4.867, 4.172, 3.65, 3.245, 2.92, 0.049, 0.024, 0.02, 0.15);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.16, 6.874, 5.499, 4.582, 3.928, 3.437, 3.055, 2.749, 0.049, 0.025, 0.02, 0.16);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.17, 6.497, 5.198, 4.331, 3.713, 3.249, 2.888, 2.599, 0.049, 0.025, 0.021, 0.17);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.18, 6.163, 4.93, 4.108, 3.522, 3.081, 2.739, 2.465, 0.05, 0.025, 0.021, 0.18);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.19, 5.864, 4.691, 3.909, 3.351, 2.932, 2.606, 2.345, 0.05, 0.025, 0.021, 0.19);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.2, 5.595, 4.476, 3.73, 3.197, 2.797, 2.487, 2.238, 0.05, 0.025, 0.021, 0.2);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.21, 5.351, 4.281, 3.568, 3.058, 2.676, 2.378, 2.141, 0.05, 0.025, 0.021, 0.21);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.22, 5.131, 4.105, 3.42, 2.932, 2.565, 2.28, 2.052, 0.05, 0.025, 0.021, 0.22);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.23, 4.929, 3.943, 3.286, 2.817, 2.465, 2.191, 1.972, 0.051, 0.025, 0.021, 0.23);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.24, 4.745, 3.796, 3.163, 2.711, 2.372, 2.109, 1.898, 0.051, 0.025, 0.021, 0.24);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.25, 4.575, 3.66, 3.05, 2.614, 2.288, 2.033, 1.83, 0.051, 0.026, 0.021, 0.25);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.26, 4.419, 3.535, 2.946, 2.525, 2.209, 1.964, 1.768, 0.051, 0.026, 0.021, 0.26);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.27, 4.274, 3.419, 2.85, 2.442, 2.137, 1.9, 1.71, 0.052, 0.026, 0.021, 0.27);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.28, 4.14, 3.312, 2.76, 2.366, 2.07, 1.84, 1.656, 0.052, 0.026, 0.022, 0.28);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.29, 4.015, 3.212, 2.677, 2.295, 2.008, 1.785, 1.606, 0.052, 0.026, 0.022, 0.29);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.3, 3.899, 3.119, 2.6, 2.228, 1.95, 1.733, 1.56, 0.052, 0.026, 0.022, 0.3);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.31, 3.791, 3.033, 2.527, 2.166, 1.895, 1.685, 1.516, 0.053, 0.026, 0.022, 0.31);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.32, 3.689, 2.951, 2.459, 2.108, 1.845, 1.64, 1.476, 0.053, 0.026, 0.022, 0.32);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.33, 3.594, 2.875, 2.396, 2.054, 1.797, 1.597, 1.438, 0.053, 0.026, 0.022, 0.33);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.34, 3.504, 2.803, 2.336, 2.002, 1.752, 1.557, 1.402, 0.053, 0.027, 0.022, 0.34);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.35, 3.42, 2.736, 2.28, 1.954, 1.71, 1.52, 1.368, 0.053, 0.027, 0.022, 0.35);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.36, 3.341, 2.672, 2.227, 1.909, 1.67, 1.485, 1.336, 0.054, 0.027, 0.022, 0.36);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.37, 3.265, 2.612, 2.177, 1.866, 1.633, 1.451, 1.306, 0.054, 0.027, 0.022, 0.37);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.38, 3.195, 2.556, 2.13, 1.825, 1.597, 1.42, 1.278, 0.054, 0.027, 0.023, 0.38);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.39, 3.127, 2.502, 2.085, 1.787, 1.564, 1.39, 1.251, 0.055, 0.027, 0.023, 0.39);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.4, 3.064, 2.451, 2.042, 1.751, 1.532, 1.362, 1.225, 0.055, 0.027, 0.023, 0.4);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.41, 3.003, 2.403, 2.002, 1.716, 1.502, 1.335, 1.201, 0.055, 0.028, 0.023, 0.41);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.42, 2.946, 2.357, 1.964, 1.683, 1.473, 1.309, 1.178, 0.055, 0.028, 0.023, 0.42);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.43, 2.891, 2.313, 1.928, 1.652, 1.446, 1.285, 1.157, 0.056, 0.028, 0.023, 0.43);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.44, 2.839, 2.271, 1.893, 1.622, 1.42, 1.262, 1.136, 0.056, 0.028, 0.023, 0.44);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.45, 2.79, 2.232, 1.86, 1.594, 1.395, 1.24, 1.116, 0.056, 0.028, 0.023, 0.45);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.46, 2.742, 2.194, 1.828, 1.567, 1.371, 1.219, 1.097, 0.056, 0.028, 0.023, 0.46);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.47, 2.697, 2.158, 1.798, 1.541, 1.349, 1.199, 1.079, 0.057, 0.028, 0.024, 0.47);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.48, 2.654, 2.123, 1.769, 1.517, 1.327, 1.18, 1.062, 0.057, 0.028, 0.024, 0.48);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.49, 2.613, 2.09, 1.742, 1.493, 1.306, 1.161, 1.045, 0.057, 0.029, 0.024, 0.49);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.5, 2.574, 2.059, 1.716, 1.471, 1.287, 1.144, 1.029, 0.058, 0.029, 0.024, 0.5);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.51, 2.536, 2.029, 1.69, 1.449, 1.268, 1.127, 1.014, 0.058, 0.029, 0.024, 0.51);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.52, 2.5, 2, 1.666, 1.428, 1.25, 1.111, 1, 0.058, 0.029, 0.024, 0.52);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.53, 2.465, 1.972, 1.643, 1.408, 1.232, 1.095, 0.986, 0.058, 0.029, 0.024, 0.53);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.54, 2.432, 1.945, 1.621, 1.389, 1.216, 1.081, 0.973, 0.059, 0.029, 0.024, 0.54);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.55, 2.4, 1.92, 1.6, 1.371, 1.2, 1.066, 0.96, 0.059, 0.029, 0.025, 0.55);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.56, 2.369, 1.895, 1.579, 1.354, 1.184, 1.053, 0.948, 0.059, 0.03, 0.025, 0.56);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.57, 2.339, 1.871, 1.56, 1.337, 1.17, 1.04, 0.936, 0.06, 0.03, 0.025, 0.57);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.58, 2.311, 1.849, 1.541, 1.321, 1.155, 1.027, 0.924, 0.06, 0.03, 0.025, 0.58);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.59, 2.284, 1.827, 1.522, 1.305, 1.142, 1.015, 0.913, 0.06, 0.03, 0.59, 0.00);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.6, 2.257, 1.806, 1.505, 1.29, 1.129, 1.003, 0.903, 0.061, 0.03, 0.6, 0.01);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.61, 2.232, 1.786, 1.488, 1.276, 1.116, 0.992, 0.893, 0.061, 0.03, 0.61, 0.02);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.62, 2.208, 1.766, 1.472, 1.262, 1.104, 0.981, 0.883, 0.061, 0.031, 0.62, 0.03);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.63, 2.184, 1.748, 1.456, 1.248, 1.092, 0.971, 0.874, 0.061, 0.63, 0.00, 0.04);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.64, 2.162, 1.73, 1.441, 1.235, 1.081, 0.961, 0.865, 0.062, 0.64, 0.01, 0.05);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.65, 2.14, 1.712, 1.427, 1.223, 1.07, 0.951, 0.856, 0.062, 0.65, 0.02, 0.06);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.66, 2.119, 1.695, 1.413, 1.211, 1.06, 0.942, 0.848, 0.063, 0.66, 0.03, 0.07);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.67, 2.099, 1.679, 1.399, 1.199, 1.049, 0.933, 0.84, 0.063, 0.67, 0.04, 0.08);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.68, 2.079, 1.664, 1.386, 1.188, 1.04, 0.924, 0.832, 0.063, 0.68, 0.05, 0.09);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.69, 2.061, 1.649, 1.374, 1.178, 1.03, 0.916, 0.824, 0.064, 0.69, 0.06, 0.10);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.7, 2.042, 1.634, 1.362, 1.167, 1.021, 0.908, 0.817, 0.064, 0.7, 0.07, 0.11);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.71, 2.025, 1.62, 1.35, 1.157, 1.012, 0.9, 0.81, 0.064, 0.71, 0.08, 0.12);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.72, 2.008, 1.606, 1.339, 1.147, 1.004, 0.892, 0.803, 0.065, 0.72, 0.09, 0.13);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.73, 1.992, 1.593, 1.328, 1.138, 0.996, 0.885, 0.797, 0.065, 0.73, 0.10, 0.14);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.74, 1.976, 1.581, 1.317, 1.129, 0.988, 0.878, 0.79, 0.065, 0.74, 0.11, 0.15);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.75, 1.961, 1.569, 1.307, 1.12, 0.98, 0.871, 0.784, 0.066, 0.75, 0.12, 0.16);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.76, 1.946, 1.557, 1.297, 1.112, 0.973, 0.865, 0.778, 0.066, 0.76, 0.13, 0.17);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.77, 1.932, 1.546, 1.288, 1.104, 0.966, 0.859, 0.773, 0.066, 0.77, 0.14, 0.18);
		tabela.add(data);
		data = new LinhaTabelaDoTipoKData(0.78, 1.918, 1.535, 1.279, 1.096, 0.959, 0.853, 0.767, 0.78, 0.00, 0.15, 0.19);
		tabela.add(data);
		
	}
	
	public double getBx(double kc, String tipoConcreto, String tipoaco) {
		// Quando o kc for maior que o cccxx, pegar o anterio
		Iterator<LinhaTabelaDoTipoKData> itabela = tabela.iterator();
		double bx = 0;
		double kcdalinha = 0;
		
		while (itabela.hasNext()) {
			LinhaTabelaDoTipoKData linha = itabela.next();
			
			switch (tipoConcreto) {
				case "C20":
					bx = linha.getBx();
					kcdalinha = linha.getKcc20();
					break;
				case "C25":
					bx = linha.getBx();
					kcdalinha = linha.getKcc25();
					break;
				case "C30":
					bx = linha.getBx();
					kcdalinha = linha.getKcc30();
					break;
				case "C35":
					bx = linha.getBx();
					kcdalinha = linha.getKcc35();
					break;
				case "C40":
					bx = linha.getBx();
					kcdalinha = linha.getKcc40();
					break;
				case "C45":
					bx = linha.getBx();
					kcdalinha = linha.getKcc45();
					break;
				case "C50":
					bx = linha.getBx();
					kcdalinha = linha.getKcc50();
					break;
			}
			if (kc > kcdalinha)
				return bx;
			
		}
		return bx;
	}
	
	public double getKs(double bx, String string, String tipoaco) {
		tabela.add(data);
		Iterator<LinhaTabelaDoTipoKData> itabela = tabela.iterator();
		double ks = 0;
		
		while (itabela.hasNext()) {
			LinhaTabelaDoTipoKData linha = itabela.next();
			
			switch (tipoaco) {
				case "CA25":
					if (bx == linha.getBx())
						return linha.getKsca25();
					break;
				case "CA50":
					if (bx == linha.getBx())
						return linha.getKsca50();
					break;
				case "CA60":
					if (bx == linha.getBx())
						return linha.getKsca60();
					break;
				
				default:
					System.out.println("Tipo não esperado");
			}
		}
		return ks;
	}
	
}
