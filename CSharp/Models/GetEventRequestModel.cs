// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Softheon.Enterprise.Api.Client.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Model for the GET Event input parameters
    /// </summary>
    public partial class GetEventRequestModel
    {
        /// <summary>
        /// Initializes a new instance of the GetEventRequestModel class.
        /// </summary>
        public GetEventRequestModel()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the GetEventRequestModel class.
        /// </summary>
        /// <param name="drawerID">Gets or sets the drawer identifier.</param>
        /// <param name="entityID">Gets or sets the entity identifier.</param>
        /// <param name="type">Gets or sets the type. Possible values include:
        /// 'Undefined', 'Fatal', 'Warning', 'Info', 'Debug', 'Process', 'RPC',
        /// 'SQL', 'DDE'</param>
        /// <param name="minEventTime">Gets or sets the minimum event
        /// time.</param>
        /// <param name="maxEventTime">Gets or sets the maximum event
        /// time.</param>
        /// <param name="eventUserID">Gets or sets the event user
        /// identifier.</param>
        /// <param name="eventGroupID">Gets or sets the event group
        /// identifier.</param>
        /// <param name="category">Gets or sets the category. Possible values
        /// include: 'Undefined', 'Entity', 'Profile', 'Attachment',
        /// 'Discussion', 'Field', 'Workflow'</param>
        /// <param name="classProperty">Gets or sets the class. Possible values
        /// include: 'Undefined', 'Application', 'Security', 'System'</param>
        /// <param name="operation">Gets or sets the operation. Possible values
        /// include: 'Undefined', 'Insert', 'Update', 'Delete', 'Copy', 'Lock',
        /// 'Unlock', 'Open', 'Close', 'Checkout', 'Checkin', 'View', 'Merge',
        /// 'Split', 'Classify', 'Null', 'OpenWF', 'Remove', 'ReturnToTop',
        /// 'ReturnToBottom', 'Accept', 'Suspend', 'Reject', 'Route',
        /// 'Forward', 'Reply', 'Reassign', 'Reset', 'Override', 'Rollback',
        /// 'Archive'</param>
        /// <param name="minProcessingTime">Gets or sets the minimum processing
        /// time.</param>
        /// <param name="maxProcessingTime">Gets or sets the maximum processing
        /// time.</param>
        /// <param name="page">Gets or sets the page number.</param>
        /// <param name="pageSize">Gets or sets the size of the page.</param>
        /// <param name="sortOrder">Gets or sets the order. Possible values
        /// include: 'Unspecified', 'Ascending', 'Descending'</param>
        /// <param name="sortBy">Gets or sets the column to order by. Possible
        /// values include: 'ID', 'Type', 'EventTime'</param>
        public GetEventRequestModel(int drawerID, int entityID, string type = default(string), System.DateTime? minEventTime = default(System.DateTime?), System.DateTime? maxEventTime = default(System.DateTime?), int? eventUserID = default(int?), int? eventGroupID = default(int?), string category = default(string), string classProperty = default(string), string operation = default(string), int? minProcessingTime = default(int?), int? maxProcessingTime = default(int?), int? page = default(int?), int? pageSize = default(int?), string sortOrder = default(string), string sortBy = default(string))
        {
            DrawerID = drawerID;
            EntityID = entityID;
            Type = type;
            MinEventTime = minEventTime;
            MaxEventTime = maxEventTime;
            EventUserID = eventUserID;
            EventGroupID = eventGroupID;
            Category = category;
            ClassProperty = classProperty;
            Operation = operation;
            MinProcessingTime = minProcessingTime;
            MaxProcessingTime = maxProcessingTime;
            Page = page;
            PageSize = pageSize;
            SortOrder = sortOrder;
            SortBy = sortBy;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the drawer identifier.
        /// </summary>
        [JsonProperty(PropertyName = "DrawerID")]
        public int DrawerID { get; set; }

        /// <summary>
        /// Gets or sets the entity identifier.
        /// </summary>
        [JsonProperty(PropertyName = "EntityID")]
        public int EntityID { get; set; }

        /// <summary>
        /// Gets or sets the type. Possible values include: 'Undefined',
        /// 'Fatal', 'Warning', 'Info', 'Debug', 'Process', 'RPC', 'SQL', 'DDE'
        /// </summary>
        [JsonProperty(PropertyName = "Type")]
        public string Type { get; set; }

        /// <summary>
        /// Gets or sets the minimum event time.
        /// </summary>
        [JsonProperty(PropertyName = "MinEventTime")]
        public System.DateTime? MinEventTime { get; set; }

        /// <summary>
        /// Gets or sets the maximum event time.
        /// </summary>
        [JsonProperty(PropertyName = "MaxEventTime")]
        public System.DateTime? MaxEventTime { get; set; }

        /// <summary>
        /// Gets or sets the event user identifier.
        /// </summary>
        [JsonProperty(PropertyName = "EventUserID")]
        public int? EventUserID { get; set; }

        /// <summary>
        /// Gets or sets the event group identifier.
        /// </summary>
        [JsonProperty(PropertyName = "EventGroupID")]
        public int? EventGroupID { get; set; }

        /// <summary>
        /// Gets or sets the category. Possible values include: 'Undefined',
        /// 'Entity', 'Profile', 'Attachment', 'Discussion', 'Field',
        /// 'Workflow'
        /// </summary>
        [JsonProperty(PropertyName = "Category")]
        public string Category { get; set; }

        /// <summary>
        /// Gets or sets the class. Possible values include: 'Undefined',
        /// 'Application', 'Security', 'System'
        /// </summary>
        [JsonProperty(PropertyName = "Class")]
        public string ClassProperty { get; set; }

        /// <summary>
        /// Gets or sets the operation. Possible values include: 'Undefined',
        /// 'Insert', 'Update', 'Delete', 'Copy', 'Lock', 'Unlock', 'Open',
        /// 'Close', 'Checkout', 'Checkin', 'View', 'Merge', 'Split',
        /// 'Classify', 'Null', 'OpenWF', 'Remove', 'ReturnToTop',
        /// 'ReturnToBottom', 'Accept', 'Suspend', 'Reject', 'Route',
        /// 'Forward', 'Reply', 'Reassign', 'Reset', 'Override', 'Rollback',
        /// 'Archive'
        /// </summary>
        [JsonProperty(PropertyName = "Operation")]
        public string Operation { get; set; }

        /// <summary>
        /// Gets or sets the minimum processing time.
        /// </summary>
        [JsonProperty(PropertyName = "MinProcessingTime")]
        public int? MinProcessingTime { get; set; }

        /// <summary>
        /// Gets or sets the maximum processing time.
        /// </summary>
        [JsonProperty(PropertyName = "MaxProcessingTime")]
        public int? MaxProcessingTime { get; set; }

        /// <summary>
        /// Gets or sets the page number.
        /// </summary>
        [JsonProperty(PropertyName = "Page")]
        public int? Page { get; set; }

        /// <summary>
        /// Gets or sets the size of the page.
        /// </summary>
        [JsonProperty(PropertyName = "PageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// Gets or sets the order. Possible values include: 'Unspecified',
        /// 'Ascending', 'Descending'
        /// </summary>
        [JsonProperty(PropertyName = "SortOrder")]
        public string SortOrder { get; set; }

        /// <summary>
        /// Gets or sets the column to order by. Possible values include: 'ID',
        /// 'Type', 'EventTime'
        /// </summary>
        [JsonProperty(PropertyName = "SortBy")]
        public string SortBy { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (DrawerID > 2147483647)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "DrawerID", 2147483647);
            }
            if (DrawerID < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "DrawerID", 1);
            }
            if (EntityID > 2147483647)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "EntityID", 2147483647);
            }
            if (EntityID < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "EntityID", 1);
            }
            if (EventUserID > 2147483647)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "EventUserID", 2147483647);
            }
            if (EventUserID < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "EventUserID", 1);
            }
            if (EventGroupID > 2147483647)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "EventGroupID", 2147483647);
            }
            if (EventGroupID < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "EventGroupID", 1);
            }
            if (Page > 2147483647)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "Page", 2147483647);
            }
            if (Page < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "Page", 1);
            }
            if (PageSize > 1000)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "PageSize", 1000);
            }
            if (PageSize < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "PageSize", 1);
            }
        }
    }
}