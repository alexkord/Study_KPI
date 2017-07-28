Pattern p = Pattern.compile(String pattern);
Matcher m = p.matcher(input);
if(m.matches()) {
    System.out.println("Success");
}
else {
    System.out.println("ERROR");
}
