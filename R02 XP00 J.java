//Non-compliant
public void deleteFile() {
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    someFile.delete();
}

//Compliant
public void deleteFile() {
    File someFile = new File("someFileName.txt");
    // Do something with someFile

    if (!someFile.delete()) {
        // Handle failure to delete the file
        System.out.println("Failed to delete file.");
    }
}