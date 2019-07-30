package Semaphores;

import java.util.concurrent.Semaphore;

public enum Downloader {

    INSTANCY;

    private Semaphore semaphore = new Semaphore(3, true);

    public void downloadData() {

        try {
            semaphore.acquire();
            download();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    private void download() {

        System.out.println("Downloading data from the web...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
