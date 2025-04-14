package br.com.una.helloworld;

public class OlaMundo {

	public String mensagem() {
		return "Hello, World!";
	}

	public static void main(String[] args) {
		OlaMundo ola = new OlaMundo();
		System.out.println(ola.mensagem());
	}
}
