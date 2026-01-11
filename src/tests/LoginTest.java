@Test
public void loginTest(){
    try{
        driver.findElement(By.id("loginbtn")).click();
    } catch (Exception e) {
        AiClient aiClient = new AiClient();
        String analysis = aiClient.analyzeTestFailure(e.toString(),"loginTest");

        System.out.println("AI ANALYSIS");
        System.out.println(analysis);

        throw e;
    }
}