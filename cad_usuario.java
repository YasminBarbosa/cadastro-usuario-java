import java.util.ArrayList;
import java.util.Scanner;

public class cad_usuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<String>();
        int input;

        do {
            System.out.println("""
            Cadastro de Usuário
            1 - Criar Usuário
            2 - Listar Usuários
            3 - Editar Usuário
            4 - Remover Usuário
            0 - Sair
            """);

            System.out.print("Selecione uma opção: ");
            input = scan.nextInt();
            scan.nextLine();

            switch(input) {
                case 1:
                        System.out.print("Nome: ");
                        String name = scan.nextLine();
                        users.add(name);
                        // incrementar com um if para sucesso ou erro na criação
                        System.out.println("Usuário " + name + " criado com sucesso!");
                    break;
                case 2:
                        System.out.println("Usuários cadastrados: ");
                        System.out.println(users);
                    break;
                case 3:
                    // NÁO EDITA USUÁRIO, QUANTO TENTADO, ELE APAGA O USUÁRIO
                        System.out.print("Posição do usuário: ");
                        int position = scan.nextInt();
                        System.out.print("Nome do usuário: ");
                        String nameEdit = scan.nextLine();
                        scan.nextLine();
                        users.set(position, nameEdit);
                        System.out.println("Usuário editado com sucesso!");
                    break;
                case 4:
                        System.out.print("Posição do usuário: ");
                        int positionRemove = scan.nextInt();
                        users.remove(positionRemove);
                    break;
                default:
                    System.out.println("Sistema encerrado!");
            }
        }
        while (input != 0);   

        scan.close();
    }    
}
