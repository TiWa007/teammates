package teammates.ui.newcontroller;

import teammates.common.datatransfer.attributes.StudentAttributes;

/**
 * Data transfer objects for {@link StudentAttributes} between controller and HTTP.
 */
public class StudentInfo {

    /**
     * The response for a student attribute.
     */
    public static class StudentResponse extends ActionResult.ActionOutput {

        private final String name;
        private final String lastName;

        public StudentResponse(StudentAttributes studentAttributes) {
            this.name = studentAttributes.getName();
            this.lastName = studentAttributes.getLastName();
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }
    }

}
