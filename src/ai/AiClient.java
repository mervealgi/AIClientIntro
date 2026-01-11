public  class AiClient {
    public String anayzeTestFailure(String stachTrace, String testName) {

        String prompt = """
        You are a senior QA Automation Engineer.

        Test Name: %s

        Stacj Trace: %s

        Analyze:
        - Is this a real bug or flaky test?
        - Possible root cause
        - Suggested fix
        """.formatted(testName,stachTrace);

        // Burada AI API call olacak
        // Şimdilik mock response dönelim
        return callAi(prompt);
    }

    private String callAi(String prompt){
        // gerçek bi API call gelicek
        return """
        Root cause: element not found due to dynamic locator.
        Suggestion: Use accessibilityId instead of XPath.
        Classification: Flaky test
        """;
    }
}