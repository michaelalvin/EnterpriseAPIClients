/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package softheon.enterprise.api.client.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The model that is sent in response to a GET request for Tasks.
 */
public class TaskModel {
    /**
     * Gets or sets the task identifier.
     */
    @JsonProperty(value = "TaskID")
    private Integer taskID;

    /**
     * Gets or sets the queue identifier.
     */
    @JsonProperty(value = "QueueID")
    private Integer queueID;

    /**
     * Gets or sets the drawer identifier.
     */
    @JsonProperty(value = "DrawerID")
    private Integer drawerID;

    /**
     * Gets or sets the object identifier (entity).
     */
    @JsonProperty(value = "ObjectID")
    private Integer objectID;

    /**
     * Gets or sets the type of the object (entity).
     */
    @JsonProperty(value = "ObjectType")
    private Integer objectType;

    /**
     * Gets or sets the task owner user identifier.
     */
    @JsonProperty(value = "OwnerUserID")
    private Integer ownerUserID;

    /**
     * Gets or sets the full name of the owner user.
     */
    @JsonProperty(value = "OwnerUserFullName")
    private String ownerUserFullName;

    /**
     * Gets or sets the task owner group identifier.
     */
    @JsonProperty(value = "OwnerGroupID")
    private Integer ownerGroupID;

    /**
     * Gets or sets the name of the owner group.
     */
    @JsonProperty(value = "OwnerGroupName")
    private String ownerGroupName;

    /**
     * Gets or sets the effective user identifier.
     */
    @JsonProperty(value = "EffectiveUserID")
    private Integer effectiveUserID;

    /**
     * Gets or sets the full name of the effective user.
     */
    @JsonProperty(value = "EffectiveUserFullName")
    private String effectiveUserFullName;

    /**
     * Gets or sets the effective group identifier.
     */
    @JsonProperty(value = "EffectiveGroupID")
    private Integer effectiveGroupID;

    /**
     * Gets or sets the name of the effective group.
     */
    @JsonProperty(value = "EffectiveGroupName")
    private String effectiveGroupName;

    /**
     * Gets or sets the previous queue identifier.
     */
    @JsonProperty(value = "PrevQueueID")
    private Integer prevQueueID;

    /**
     * Gets or sets the next queue identifier.
     */
    @JsonProperty(value = "NextQueueID")
    private Integer nextQueueID;

    /**
     * Gets or sets the task insertion time.
     */
    @JsonProperty(value = "InsertionTime")
    private DateTime insertionTime;

    /**
     * Gets or sets the address identifier.
     */
    @JsonProperty(value = "AddressID")
    private Integer addressID;

    /**
     * Gets or sets the description of the task.
     */
    @JsonProperty(value = "Description")
    private String description;

    /**
     * Gets or sets message 1.
     */
    @JsonProperty(value = "Message1")
    private String message1;

    /**
     * Gets or sets message 2.
     */
    @JsonProperty(value = "Message2")
    private String message2;

    /**
     * Gets or sets message 3.
     */
    @JsonProperty(value = "Message3")
    private String message3;

    /**
     * Gets or sets message 4.
     */
    @JsonProperty(value = "Message4")
    private String message4;

    /**
     * Gets or sets message5.
     */
    @JsonProperty(value = "Message5")
    private String message5;

    /**
     * Gets or sets message 6.
     */
    @JsonProperty(value = "Message6")
    private String message6;

    /**
     * Gets or sets message 7.
     */
    @JsonProperty(value = "Message7")
    private String message7;

    /**
     * Gets or sets message 8.
     */
    @JsonProperty(value = "Message8")
    private String message8;

    /**
     * Gets or sets message 9.
     */
    @JsonProperty(value = "Message9")
    private String message9;

    /**
     * Gets or sets message 10.
     */
    @JsonProperty(value = "Message10")
    private String message10;

    /**
     * Gets or sets message 11.
     */
    @JsonProperty(value = "Message11")
    private String message11;

    /**
     * Gets or sets message 12.
     */
    @JsonProperty(value = "Message12")
    private String message12;

    /**
     * Gets or sets message 13.
     */
    @JsonProperty(value = "Message13")
    private String message13;

    /**
     * Gets or sets message 14.
     */
    @JsonProperty(value = "Message14")
    private String message14;

    /**
     * Gets or sets message 15.
     */
    @JsonProperty(value = "Message15")
    private String message15;

    /**
     * Gets or sets message 16.
     */
    @JsonProperty(value = "Message16")
    private String message16;

    /**
     * Gets or sets the task state.
     */
    @JsonProperty(value = "State")
    private Integer state;

    /**
     * Gets or sets the task priority.
     */
    @JsonProperty(value = "Priority")
    private Integer priority;

    /**
     * Gets or sets the task resolution time.
     */
    @JsonProperty(value = "ResolutionTime")
    private DateTime resolutionTime;

    /**
     * Gets or sets the task file attachment name.
     */
    @JsonProperty(value = "TaskFileAttachment")
    private String taskFileAttachment;

    /**
     * Gets or sets reserved integer 1.
     */
    @JsonProperty(value = "ReservedInt1")
    private Integer reservedInt1;

    /**
     * Gets or sets reserved string 1.
     */
    @JsonProperty(value = "ReservedString1")
    private String reservedString1;

    /**
     * Get the taskID value.
     *
     * @return the taskID value
     */
    public Integer taskID() {
        return this.taskID;
    }

    /**
     * Set the taskID value.
     *
     * @param taskID the taskID value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withTaskID(Integer taskID) {
        this.taskID = taskID;
        return this;
    }

    /**
     * Get the queueID value.
     *
     * @return the queueID value
     */
    public Integer queueID() {
        return this.queueID;
    }

    /**
     * Set the queueID value.
     *
     * @param queueID the queueID value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withQueueID(Integer queueID) {
        this.queueID = queueID;
        return this;
    }

    /**
     * Get the drawerID value.
     *
     * @return the drawerID value
     */
    public Integer drawerID() {
        return this.drawerID;
    }

    /**
     * Set the drawerID value.
     *
     * @param drawerID the drawerID value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withDrawerID(Integer drawerID) {
        this.drawerID = drawerID;
        return this;
    }

    /**
     * Get the objectID value.
     *
     * @return the objectID value
     */
    public Integer objectID() {
        return this.objectID;
    }

    /**
     * Set the objectID value.
     *
     * @param objectID the objectID value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withObjectID(Integer objectID) {
        this.objectID = objectID;
        return this;
    }

    /**
     * Get the objectType value.
     *
     * @return the objectType value
     */
    public Integer objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType value.
     *
     * @param objectType the objectType value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withObjectType(Integer objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the ownerUserID value.
     *
     * @return the ownerUserID value
     */
    public Integer ownerUserID() {
        return this.ownerUserID;
    }

    /**
     * Set the ownerUserID value.
     *
     * @param ownerUserID the ownerUserID value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withOwnerUserID(Integer ownerUserID) {
        this.ownerUserID = ownerUserID;
        return this;
    }

    /**
     * Get the ownerUserFullName value.
     *
     * @return the ownerUserFullName value
     */
    public String ownerUserFullName() {
        return this.ownerUserFullName;
    }

    /**
     * Set the ownerUserFullName value.
     *
     * @param ownerUserFullName the ownerUserFullName value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withOwnerUserFullName(String ownerUserFullName) {
        this.ownerUserFullName = ownerUserFullName;
        return this;
    }

    /**
     * Get the ownerGroupID value.
     *
     * @return the ownerGroupID value
     */
    public Integer ownerGroupID() {
        return this.ownerGroupID;
    }

    /**
     * Set the ownerGroupID value.
     *
     * @param ownerGroupID the ownerGroupID value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withOwnerGroupID(Integer ownerGroupID) {
        this.ownerGroupID = ownerGroupID;
        return this;
    }

    /**
     * Get the ownerGroupName value.
     *
     * @return the ownerGroupName value
     */
    public String ownerGroupName() {
        return this.ownerGroupName;
    }

    /**
     * Set the ownerGroupName value.
     *
     * @param ownerGroupName the ownerGroupName value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withOwnerGroupName(String ownerGroupName) {
        this.ownerGroupName = ownerGroupName;
        return this;
    }

    /**
     * Get the effectiveUserID value.
     *
     * @return the effectiveUserID value
     */
    public Integer effectiveUserID() {
        return this.effectiveUserID;
    }

    /**
     * Set the effectiveUserID value.
     *
     * @param effectiveUserID the effectiveUserID value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withEffectiveUserID(Integer effectiveUserID) {
        this.effectiveUserID = effectiveUserID;
        return this;
    }

    /**
     * Get the effectiveUserFullName value.
     *
     * @return the effectiveUserFullName value
     */
    public String effectiveUserFullName() {
        return this.effectiveUserFullName;
    }

    /**
     * Set the effectiveUserFullName value.
     *
     * @param effectiveUserFullName the effectiveUserFullName value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withEffectiveUserFullName(String effectiveUserFullName) {
        this.effectiveUserFullName = effectiveUserFullName;
        return this;
    }

    /**
     * Get the effectiveGroupID value.
     *
     * @return the effectiveGroupID value
     */
    public Integer effectiveGroupID() {
        return this.effectiveGroupID;
    }

    /**
     * Set the effectiveGroupID value.
     *
     * @param effectiveGroupID the effectiveGroupID value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withEffectiveGroupID(Integer effectiveGroupID) {
        this.effectiveGroupID = effectiveGroupID;
        return this;
    }

    /**
     * Get the effectiveGroupName value.
     *
     * @return the effectiveGroupName value
     */
    public String effectiveGroupName() {
        return this.effectiveGroupName;
    }

    /**
     * Set the effectiveGroupName value.
     *
     * @param effectiveGroupName the effectiveGroupName value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withEffectiveGroupName(String effectiveGroupName) {
        this.effectiveGroupName = effectiveGroupName;
        return this;
    }

    /**
     * Get the prevQueueID value.
     *
     * @return the prevQueueID value
     */
    public Integer prevQueueID() {
        return this.prevQueueID;
    }

    /**
     * Set the prevQueueID value.
     *
     * @param prevQueueID the prevQueueID value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withPrevQueueID(Integer prevQueueID) {
        this.prevQueueID = prevQueueID;
        return this;
    }

    /**
     * Get the nextQueueID value.
     *
     * @return the nextQueueID value
     */
    public Integer nextQueueID() {
        return this.nextQueueID;
    }

    /**
     * Set the nextQueueID value.
     *
     * @param nextQueueID the nextQueueID value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withNextQueueID(Integer nextQueueID) {
        this.nextQueueID = nextQueueID;
        return this;
    }

    /**
     * Get the insertionTime value.
     *
     * @return the insertionTime value
     */
    public DateTime insertionTime() {
        return this.insertionTime;
    }

    /**
     * Set the insertionTime value.
     *
     * @param insertionTime the insertionTime value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withInsertionTime(DateTime insertionTime) {
        this.insertionTime = insertionTime;
        return this;
    }

    /**
     * Get the addressID value.
     *
     * @return the addressID value
     */
    public Integer addressID() {
        return this.addressID;
    }

    /**
     * Set the addressID value.
     *
     * @param addressID the addressID value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withAddressID(Integer addressID) {
        this.addressID = addressID;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the message1 value.
     *
     * @return the message1 value
     */
    public String message1() {
        return this.message1;
    }

    /**
     * Set the message1 value.
     *
     * @param message1 the message1 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage1(String message1) {
        this.message1 = message1;
        return this;
    }

    /**
     * Get the message2 value.
     *
     * @return the message2 value
     */
    public String message2() {
        return this.message2;
    }

    /**
     * Set the message2 value.
     *
     * @param message2 the message2 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage2(String message2) {
        this.message2 = message2;
        return this;
    }

    /**
     * Get the message3 value.
     *
     * @return the message3 value
     */
    public String message3() {
        return this.message3;
    }

    /**
     * Set the message3 value.
     *
     * @param message3 the message3 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage3(String message3) {
        this.message3 = message3;
        return this;
    }

    /**
     * Get the message4 value.
     *
     * @return the message4 value
     */
    public String message4() {
        return this.message4;
    }

    /**
     * Set the message4 value.
     *
     * @param message4 the message4 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage4(String message4) {
        this.message4 = message4;
        return this;
    }

    /**
     * Get the message5 value.
     *
     * @return the message5 value
     */
    public String message5() {
        return this.message5;
    }

    /**
     * Set the message5 value.
     *
     * @param message5 the message5 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage5(String message5) {
        this.message5 = message5;
        return this;
    }

    /**
     * Get the message6 value.
     *
     * @return the message6 value
     */
    public String message6() {
        return this.message6;
    }

    /**
     * Set the message6 value.
     *
     * @param message6 the message6 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage6(String message6) {
        this.message6 = message6;
        return this;
    }

    /**
     * Get the message7 value.
     *
     * @return the message7 value
     */
    public String message7() {
        return this.message7;
    }

    /**
     * Set the message7 value.
     *
     * @param message7 the message7 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage7(String message7) {
        this.message7 = message7;
        return this;
    }

    /**
     * Get the message8 value.
     *
     * @return the message8 value
     */
    public String message8() {
        return this.message8;
    }

    /**
     * Set the message8 value.
     *
     * @param message8 the message8 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage8(String message8) {
        this.message8 = message8;
        return this;
    }

    /**
     * Get the message9 value.
     *
     * @return the message9 value
     */
    public String message9() {
        return this.message9;
    }

    /**
     * Set the message9 value.
     *
     * @param message9 the message9 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage9(String message9) {
        this.message9 = message9;
        return this;
    }

    /**
     * Get the message10 value.
     *
     * @return the message10 value
     */
    public String message10() {
        return this.message10;
    }

    /**
     * Set the message10 value.
     *
     * @param message10 the message10 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage10(String message10) {
        this.message10 = message10;
        return this;
    }

    /**
     * Get the message11 value.
     *
     * @return the message11 value
     */
    public String message11() {
        return this.message11;
    }

    /**
     * Set the message11 value.
     *
     * @param message11 the message11 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage11(String message11) {
        this.message11 = message11;
        return this;
    }

    /**
     * Get the message12 value.
     *
     * @return the message12 value
     */
    public String message12() {
        return this.message12;
    }

    /**
     * Set the message12 value.
     *
     * @param message12 the message12 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage12(String message12) {
        this.message12 = message12;
        return this;
    }

    /**
     * Get the message13 value.
     *
     * @return the message13 value
     */
    public String message13() {
        return this.message13;
    }

    /**
     * Set the message13 value.
     *
     * @param message13 the message13 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage13(String message13) {
        this.message13 = message13;
        return this;
    }

    /**
     * Get the message14 value.
     *
     * @return the message14 value
     */
    public String message14() {
        return this.message14;
    }

    /**
     * Set the message14 value.
     *
     * @param message14 the message14 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage14(String message14) {
        this.message14 = message14;
        return this;
    }

    /**
     * Get the message15 value.
     *
     * @return the message15 value
     */
    public String message15() {
        return this.message15;
    }

    /**
     * Set the message15 value.
     *
     * @param message15 the message15 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage15(String message15) {
        this.message15 = message15;
        return this;
    }

    /**
     * Get the message16 value.
     *
     * @return the message16 value
     */
    public String message16() {
        return this.message16;
    }

    /**
     * Set the message16 value.
     *
     * @param message16 the message16 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withMessage16(String message16) {
        this.message16 = message16;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public Integer state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the resolutionTime value.
     *
     * @return the resolutionTime value
     */
    public DateTime resolutionTime() {
        return this.resolutionTime;
    }

    /**
     * Set the resolutionTime value.
     *
     * @param resolutionTime the resolutionTime value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withResolutionTime(DateTime resolutionTime) {
        this.resolutionTime = resolutionTime;
        return this;
    }

    /**
     * Get the taskFileAttachment value.
     *
     * @return the taskFileAttachment value
     */
    public String taskFileAttachment() {
        return this.taskFileAttachment;
    }

    /**
     * Set the taskFileAttachment value.
     *
     * @param taskFileAttachment the taskFileAttachment value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withTaskFileAttachment(String taskFileAttachment) {
        this.taskFileAttachment = taskFileAttachment;
        return this;
    }

    /**
     * Get the reservedInt1 value.
     *
     * @return the reservedInt1 value
     */
    public Integer reservedInt1() {
        return this.reservedInt1;
    }

    /**
     * Set the reservedInt1 value.
     *
     * @param reservedInt1 the reservedInt1 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withReservedInt1(Integer reservedInt1) {
        this.reservedInt1 = reservedInt1;
        return this;
    }

    /**
     * Get the reservedString1 value.
     *
     * @return the reservedString1 value
     */
    public String reservedString1() {
        return this.reservedString1;
    }

    /**
     * Set the reservedString1 value.
     *
     * @param reservedString1 the reservedString1 value to set
     * @return the TaskModel object itself.
     */
    public TaskModel withReservedString1(String reservedString1) {
        this.reservedString1 = reservedString1;
        return this;
    }

}
