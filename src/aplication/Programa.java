package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Número do Quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data de Entrada (dd/MM/yyyy): ");
		Date entrada = sdf.parse(sc.next());
		System.out.print("Data de Saida (dd/MM/yyyy): ");
		Date saida = sdf.parse(sc.next());
		
		if(!saida.after(entrada)) {
			System.out.println("Erro na Reserva: Data de saida deve ser posterior a Data de Entrada!");			
		}else {
			Reserva reserva = new Reserva(numero, entrada, saida);
			System.out.println("Reserva: " + reserva);
			System.out.println();
			System.out.println("Entre com as Datas para Atualizar a Reservva...");
			System.out.print("Data de Entrada (dd/MM/yyyy): ");
			entrada = sdf.parse(sc.next());
			System.out.print("Data de Saida (dd/MM/yyyy): ");
			saida = sdf.parse(sc.next());
			
			
			Date agora = new Date();
			if(entrada.before(agora) || saida.before(agora)) {
				System.out.println("Erro na Reserva: As Datas de Reserva para Atualizar devem ser Datas Futuras!");	
			}else if(!saida.after(entrada)) {
				System.out.println("Erro na Reserva: Data de saida deve ser posterior a Data de Entrada!");	
			}else {
			reserva.atualizaData(entrada, saida);
			System.out.println("Reserva: " + reserva);
			}
		}
		sc.close();

	}

}
