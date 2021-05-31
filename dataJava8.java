import javax.swing.*;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class dataJava8 {
    public static  void  main(String[] args){
       /* Instant iInicial = Instant.now();
        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        Instant iFinal = Instant.now();
        Duration duracao = Duration.between(iInicial, iFinal);

        System.out.println("Duaracao em nanos segundos: "+ duracao.toNanos());
        System.out.println("Duaracao em minutos: "+ duracao.toMinutes());
        System.out.println("Duaracao em horas: "+ duracao.toHours());
        System.out.println("Duaracao em milisegundos: "+ duracao.toMillis());
        System.out.println("Duaracao em dias: "+ duracao.toDays());*/

        String diaAdmissao = JOptionPane.showInputDialog(null,"Digite o dia de admissao");
        String mesAdmissao = JOptionPane.showInputDialog(null,"Digite o mes de admissao");
        String anoAdmissao = JOptionPane.showInputDialog(null,"Digite o ano de admissao");
        int diaAdmissaoInt = Integer.parseInt(diaAdmissao);
        int mesAdmissaoInt = Integer.parseInt(mesAdmissao);
        int anoAdmissaoInt = Integer.parseInt(anoAdmissao);


        LocalDate localDateAntigo = LocalDate.of(anoAdmissaoInt,
                mesAdmissaoInt,
                diaAdmissaoInt);
        LocalDate localDateNovo = LocalDate.of(2021,5,31);
        System.out.println(localDateAntigo.isAfter(localDateNovo));
        System.out.println(localDateAntigo.isBefore(localDateNovo));
        System.out.println(localDateAntigo.isEqual(localDateNovo));

        Period periodo = Period.between(localDateAntigo, localDateNovo);
        System.out.println(periodo.getYears()+ " Anos " + periodo.getMonths() + " Meses " + periodo.getDays()+ " Dias ");
        System.out.println(" Apenas Meses: " + periodo.toTotalMonths());
        JOptionPane.showMessageDialog(null, "Apenas Meses " + periodo.toTotalMonths() + " Done! ");


    }
}
