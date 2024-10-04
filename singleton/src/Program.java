public class Program {
    static MemoryLogger logger;

    public static void main(String[] args){

        assignVoucher("issam@metigator.com", "ABC123");

        useVoucher("ABC123");

        logger.showLog();
    }

    static void assignVoucher(String email, String voucher){
        logger = MemoryLogger.getLogger();

        logger.logInfo(String.format("Voucher '%s' assigned", voucher));

        logger.logError(String.format("Unable to send email '%s'", email));

    }

    static void useVoucher(String voucher){
        logger = MemoryLogger.getLogger();

        logger.logWarning("3 attempts made to validate the voucher");

        logger.logInfo(String.format("'%s' is used", voucher));


    }
}

