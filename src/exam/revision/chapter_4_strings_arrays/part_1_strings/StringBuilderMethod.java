package exam.revision.chapter_4_strings_arrays.part_1_strings;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 31/10/2014
 * @project JavaExamProject
 */
public class StringBuilderMethod {

    private static String companyName = "AGEAS INSURANCE LIMITED";

    public static void main(String[] args) {

        String randomStr = "489464-1402201400002qRFNW11hoMeBXczmhm13jIZ3OOBcJ8jM9zp4oT7WSsUwMLSRkJYCcjd1sgQqmfC77TtTvYNPCY9X8UhrZEKEL";

        StringBuilder stringBuilder = new StringBuilder(companyName);
        stringBuilder.append(" " );
        stringBuilder.append(randomStr);

        System.out.println(stringBuilder.toString());
    }
}
