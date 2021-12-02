//package teste_treino;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//
//public class Adai01 {
//
//	public static void main(String[] args) throws IOException {
//		
//		CopiaDirArq cda = new CopiaDirArq();
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//
//		System.out.println("Entre com o nome do diretório de origem ou o nome do arquivo: ");
//		String arq = in.readLine();
//		
//		File src = new File(arq);
//		
//		System.out.println("Entre com o diretório de destino ou o nome do arquivo: ");
//		String dest = in.readLine();
//		
//		File dst = new File(dest);
//		
//		cda.copiaDirArq(src, dst);
//	}
//	
//	public void copiaDirArq(File srcCaminho, File dstCaminho) throws IOException {
//		
//		if (srcCaminho.isDirectory()) {
//			if (!dstCaminho.exists()) {
//				dstCaminho.mkdir();
//			}
//			
//			String arquivo[] = srcCaminho.list();
//			
//			for(int i = 0; i < arquivo.length; i++) {
//				copiaDirArq(new File(srcCaminho, arquivo[i]), new File(dstCaminho, arquivo[i]));
//			}
//		}
//		else {
//			if (!srcCaminho.exists()) {
//				System.out.println("Arquivo ou diretório não existe!!!!");
//				System.exit(0);
//			}
//			else {
//				InputStream entrada = new FileInputStream(srcCaminho);
//				OutputStream saida = new FileOutputStream(dstCaminho);
//				
//				byte[] buf = new byte[1024];
//				
//				int len;
//				
//				while ((len = entrada.read(buf)) > 0) {
//					saida.write(buf, 0, len);
//				}
//				
//				entrada.close();
//				saida.close();
//			}
//		}
//
//		System.out.println("Diretório(s) e arquivo(s) copiados. ");
//	}
//
//
//}
