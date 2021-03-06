/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package softheon.enterprise.api.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines properties and methods for Workflow Action Route Model.
 */
public class WorkflowActionRouteModel {
    /**
     * Gets or sets the drawer identifier.
     */
    @JsonProperty(value = "DrawerID")
    private Integer drawerID;

    /**
     * Gets or sets the entity identifier.
     */
    @JsonProperty(value = "EntityID")
    private Integer entityID;

    /**
     * Gets or sets a value indicating whether [keep original task].
     */
    @JsonProperty(value = "KeepOriginalTask")
    private Boolean keepOriginalTask;

    /**
     * Gets or sets the task identifier.
     */
    @JsonProperty(value = "TaskID")
    private Integer taskID;

    /**
     * Gets or sets the target id.
     */
    @JsonProperty(value = "TargetID")
    private Integer targetID;

    /**
     * Gets or sets the name of the queue.
     */
    @JsonProperty(value = "QueueName")
    private String queueName;

    /**
     * Gets or sets the source.
     */
    @JsonProperty(value = "Source")
    private String source;

    /**
     * Gets or sets the name of the computer.
     */
    @JsonProperty(value = "Computer")
    private String computer;

    /**
     * Gets or sets the IP address.
     */
    @JsonProperty(value = "IPAddress")
    private String iPAddress;

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
     * @return the WorkflowActionRouteModel object itself.
     */
    public WorkflowActionRouteModel withDrawerID(Integer drawerID) {
        this.drawerID = drawerID;
        return this;
    }

    /**
     * Get the entityID value.
     *
     * @return the entityID value
     */
    public Integer entityID() {
        return this.entityID;
    }

    /**
     * Set the entityID value.
     *
     * @param entityID the entityID value to set
     * @return the WorkflowActionRouteModel object itself.
     */
    public WorkflowActionRouteModel withEntityID(Integer entityID) {
        this.entityID = entityID;
        return this;
    }

    /**
     * Get the keepOriginalTask value.
     *
     * @return the keepOriginalTask value
     */
    public Boolean keepOriginalTask() {
        return this.keepOriginalTask;
    }

    /**
     * Set the keepOriginalTask value.
     *
     * @param keepOriginalTask the keepOriginalTask value to set
     * @return the WorkflowActionRouteModel object itself.
     */
    public WorkflowActionRouteModel withKeepOriginalTask(Boolean keepOriginalTask) {
        this.keepOriginalTask = keepOriginalTask;
        return this;
    }

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
     * @return the WorkflowActionRouteModel object itself.
     */
    public WorkflowActionRouteModel withTaskID(Integer taskID) {
        this.taskID = taskID;
        return this;
    }

    /**
     * Get the targetID value.
     *
     * @return the targetID value
     */
    public Integer targetID() {
        return this.targetID;
    }

    /**
     * Set the targetID value.
     *
     * @param targetID the targetID value to set
     * @return the WorkflowActionRouteModel object itself.
     */
    public WorkflowActionRouteModel withTargetID(Integer targetID) {
        this.targetID = targetID;
        return this;
    }

    /**
     * Get the queueName value.
     *
     * @return the queueName value
     */
    public String queueName() {
        return this.queueName;
    }

    /**
     * Set the queueName value.
     *
     * @param queueName the queueName value to set
     * @return the WorkflowActionRouteModel object itself.
     */
    public WorkflowActionRouteModel withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the WorkflowActionRouteModel object itself.
     */
    public WorkflowActionRouteModel withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the computer value.
     *
     * @return the computer value
     */
    public String computer() {
        return this.computer;
    }

    /**
     * Set the computer value.
     *
     * @param computer the computer value to set
     * @return the WorkflowActionRouteModel object itself.
     */
    public WorkflowActionRouteModel withComputer(String computer) {
        this.computer = computer;
        return this;
    }

    /**
     * Get the iPAddress value.
     *
     * @return the iPAddress value
     */
    public String iPAddress() {
        return this.iPAddress;
    }

    /**
     * Set the iPAddress value.
     *
     * @param iPAddress the iPAddress value to set
     * @return the WorkflowActionRouteModel object itself.
     */
    public WorkflowActionRouteModel withIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
        return this;
    }

}
