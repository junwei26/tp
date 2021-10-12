package seedu.address.testutil;

import seedu.address.model.group.Description;
import seedu.address.model.group.Group;
import seedu.address.model.group.GroupName;

/**
 * A utility class to help with building Student objects.
 */
public class GroupBuilder {

    public static final String DEFAULT_GROUPNAME = "CS2103T";
    public static final String DEFAULT_DESCRIPTION = "hi";

    private GroupName groupName;
    private Description description;

    /**
     * Creates a {@code GroupBuilder} with the default details.
     */
    public GroupBuilder() {
        groupName = new GroupName(DEFAULT_GROUPNAME);
        description = new Description(DEFAULT_DESCRIPTION);
    }

    /**
     * Initializes the GroupBuilder with the data of {@code groupToCopy}.
     */
    public GroupBuilder(Group groupToCopy) {
        groupName = groupToCopy.getGroupName();
        description = groupToCopy.getDescription();
    }

    /**
     * Sets the {@code GroupName} of the {@code Group} that we are building.
     */
    public GroupBuilder withGroupName(String groupName) {
        this.groupName = new GroupName(groupName);
        return this;
    }

    /**
     * Sets the {@code Description} of the {@code Group} that we are building.
     */
    public GroupBuilder withDescription(String description) {
        this.description = new Description(description);
        return this;
    }

    /**
     * Builds a group
     * @return built group
     */
    public Group build() {
        return new Group(groupName, description);
    }

}