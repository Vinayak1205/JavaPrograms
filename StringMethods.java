class Main6{
	
	public static void main(String args[]){
		
		  String str = "Hello, World!";
        System.out.println("Original String: " + str);
        
        System.out.println("Length: " + str.length()); 
        
        System.out.println("Character at index 1: " + str.charAt(1)); 
        
        System.out.println("Is Empty: " + str.isEmpty()); 
        
        String anotherStr = "Hello, World!";
        System.out.println("Equals (same string): " + str.equals(anotherStr)); 
        
        System.out.println("Equals Ignore Case (same content, different case): " + str.equalsIgnoreCase("hello, world!")); 
        
        System.out.println("compareTo (comparison with another string): " + str.compareTo("Hello, World!")); 
        
        System.out.println("compareToIgnoreCase (ignore case comparison): " + str.compareToIgnoreCase("HELLO, WORLD!")); 
        
        System.out.println("Contains 'World': " + str.contains("World")); 
        
        System.out.println("indexOf('o'): " + str.indexOf('o')); 
        
        System.out.println("indexOf('World'): " + str.indexOf("World"));
        
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o')); 
        
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf("o"));
        
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        
    System.out.println("Ends with 'World!': " + str.endsWith("World!")); 
        
        System.out.println("toLowerCase: " + str.toLowerCase()); 
        
        System.out.println("toUpperCase: " + str.toUpperCase()); 
        
        String strWithSpaces = "   Hello   ";
        System.out.println("trim(): '" + strWithSpaces.trim() + "'");
        
        System.out.println("substring(7): " + str.substring(7)); 
        
        System.out.println("substring(0, 5): " + str.substring(0, 5));
        
        System.out.println("replace 'o' with 'a': " + str.replace('o', 'a'));
        
        System.out.println("replaceAll('o', 'a'): " + str.replaceAll("o", "a"));
        
        System.out.println("replaceFirst('o', 'a'): " + str.replaceFirst("o", "a"));
        
        System.out.println("concat with ' How are you?': " + str.concat(" How are you?")); 
        
	}
}
