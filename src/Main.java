
public class Main {
    public static void main(String[] args) {


        Empresa empresa = new Empresa();
        System.out.println(empresa.nomeEmpresa);
        System.out.println(empresa.CnpjEmpresa);
        System.out.println(empresa.TipoEmpresa);

        System.out.println("O nome do funcionario é: " + empresa.nomeFuncionario);
        System.out.println("O salario do funcionario é : " + empresa.valorSalarioFuncionario);
        System.out.println("O cargo do funcionario é: " + empresa.cargoFuncionario);




        Funcionario funcionario = new Funcionario();
        System.out.println("O nome do funcionario é: " + funcionario.nomeFuncionario);
        System.out.println("O salario do funcionario é : " + funcionario.valorSalarioFuncionario);
        System.out.println("O cargo do funcionario é: " + funcionario.cargoFuncionario);



        //double tes01 = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0;
//        float tes02 = 99999999999999999999999999999999999999.9F;
//        long tes04 = 999999999999999999L;
//        int tes03 = 999999999;


        int aumento = 120;
        int salarioFuncionario = 1512;

        System.out.println();


        System.out.println(aumento + salarioFuncionario);

        System.out.println(aumento - salarioFuncionario);

        System.out.println(aumento * salarioFuncionario); // Não acontece no mundo real

        System.out.println(aumento / salarioFuncionario);

        System.out.println(salarioFuncionario / aumento);


    }
}