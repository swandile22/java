package LessonTwoHomeWork;

import java.math.BigDecimal;

public class PoisedPMProgram {

    public static void main(String[] args) {

        BigDecimal totalChargeFee = new BigDecimal(9200000.00);
        BigDecimal amountPaidToDate = new BigDecimal(6200000.00);

        Project phalaPhala = new Project(
                123456789,
                "Project Phala phala",
                "Mine",
                "22 le ema pedini",
                4596,
                totalChargeFee,
                amountPaidToDate,
                "32 May 2024"

        );

        System.out.println(phalaPhala);
    }
}
