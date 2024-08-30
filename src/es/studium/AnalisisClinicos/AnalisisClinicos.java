package es.studium.AnalisisClinicos;

import java.util.Random;

public class AnalisisClinicos
{
	public static void main(String[] args)
	{
		final int TAM = 5;
		Random aleatorio = new Random();
		
		String[] elementos = { 
				"Glóbulos rojos (millones/mm³)",
				"Glóbulos blancos (ml³)",
				"Hematocrito (%)",
				"Hemoglobina (g/dL)",
				"Glucosa (mg/dl)"
		};
		
		float[][] referencias = {
				{4.5f, 5.9f},
				{4000.0f, 11000.0f},
				{40.0f, 54.0f},
				{13.5f, 17.5f},
				{70.0f, 110.0f}
		};
		float[] valores = new float[TAM];
		for(int i = 0; i < TAM; i++)
		{
			valores[i] = aleatorio.nextFloat(referencias[i][1]) + (referencias[i][0] + referencias[i][1]) / 3;
		}
		int i = 0;
		char asterisco = '*';
		for(float[] rango: referencias)
		{
			if(valores[i]>rango[1])
			{
				asterisco = '*';
			}
			else
			{
				asterisco = ' ';
			}
			System.out.printf("%-30s %10.2f - (%10.2f - %-10.2f) %c", elementos[i], valores[i], rango[0], rango[1], asterisco);
			System.out.println();
			i++;
		}
	}
}