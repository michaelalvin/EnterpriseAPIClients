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
    /// Model for the GET Attachment Version input parameters
    /// </summary>
    public partial class GetAttachmentVersionRequestModel
    {
        /// <summary>
        /// Initializes a new instance of the GetAttachmentVersionRequestModel
        /// class.
        /// </summary>
        public GetAttachmentVersionRequestModel()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the GetAttachmentVersionRequestModel
        /// class.
        /// </summary>
        /// <param name="version">Gets or sets the indexed version
        /// value.</param>
        /// <param name="creatorUserID">Gets or sets the creator
        /// identifier.</param>
        /// <param name="accessorUserID">Gets or sets the identifier of the
        /// user who accessed the attachment version.</param>
        /// <param name="minAccessTime">Gets or sets the min time the version
        /// was last accessed.</param>
        /// <param name="maxAccessTime">Gets or sets the max time the version
        /// was last accessed.</param>
        /// <param name="minCreationTime">Gets or sets the min creation time of
        /// the attachment version.</param>
        /// <param name="maxCreationTime">Gets or sets the max creation time of
        /// the attachment version.</param>
        /// <param name="minModificationTime">Gets or sets the min modification
        /// time of the attachment version.</param>
        /// <param name="maxModificationTime">Gets or sets the max modification
        /// time of the attachment version.</param>
        /// <param name="page">Gets or sets the page number.</param>
        /// <param name="pageSize">Gets or sets the size of the page.</param>
        /// <param name="sortOrder">Gets or sets the order. Possible values
        /// include: 'Unspecified', 'Ascending', 'Descending'</param>
        /// <param name="sortBy">Gets or sets the column to order by. Possible
        /// values include: 'Version', 'CreatorUserID', 'AccessorUserID',
        /// 'AccessTime', 'CreationTime', 'ModificationTime'</param>
        public GetAttachmentVersionRequestModel(int? version = default(int?), int? creatorUserID = default(int?), int? accessorUserID = default(int?), System.DateTime? minAccessTime = default(System.DateTime?), System.DateTime? maxAccessTime = default(System.DateTime?), System.DateTime? minCreationTime = default(System.DateTime?), System.DateTime? maxCreationTime = default(System.DateTime?), System.DateTime? minModificationTime = default(System.DateTime?), System.DateTime? maxModificationTime = default(System.DateTime?), int? page = default(int?), int? pageSize = default(int?), string sortOrder = default(string), string sortBy = default(string))
        {
            Version = version;
            CreatorUserID = creatorUserID;
            AccessorUserID = accessorUserID;
            MinAccessTime = minAccessTime;
            MaxAccessTime = maxAccessTime;
            MinCreationTime = minCreationTime;
            MaxCreationTime = maxCreationTime;
            MinModificationTime = minModificationTime;
            MaxModificationTime = maxModificationTime;
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
        /// Gets or sets the indexed version value.
        /// </summary>
        [JsonProperty(PropertyName = "Version")]
        public int? Version { get; set; }

        /// <summary>
        /// Gets or sets the creator identifier.
        /// </summary>
        [JsonProperty(PropertyName = "CreatorUserID")]
        public int? CreatorUserID { get; set; }

        /// <summary>
        /// Gets or sets the identifier of the user who accessed the attachment
        /// version.
        /// </summary>
        [JsonProperty(PropertyName = "AccessorUserID")]
        public int? AccessorUserID { get; set; }

        /// <summary>
        /// Gets or sets the min time the version was last accessed.
        /// </summary>
        [JsonProperty(PropertyName = "MinAccessTime")]
        public System.DateTime? MinAccessTime { get; set; }

        /// <summary>
        /// Gets or sets the max time the version was last accessed.
        /// </summary>
        [JsonProperty(PropertyName = "MaxAccessTime")]
        public System.DateTime? MaxAccessTime { get; set; }

        /// <summary>
        /// Gets or sets the min creation time of the attachment version.
        /// </summary>
        [JsonProperty(PropertyName = "MinCreationTime")]
        public System.DateTime? MinCreationTime { get; set; }

        /// <summary>
        /// Gets or sets the max creation time of the attachment version.
        /// </summary>
        [JsonProperty(PropertyName = "MaxCreationTime")]
        public System.DateTime? MaxCreationTime { get; set; }

        /// <summary>
        /// Gets or sets the min modification time of the attachment version.
        /// </summary>
        [JsonProperty(PropertyName = "MinModificationTime")]
        public System.DateTime? MinModificationTime { get; set; }

        /// <summary>
        /// Gets or sets the max modification time of the attachment version.
        /// </summary>
        [JsonProperty(PropertyName = "MaxModificationTime")]
        public System.DateTime? MaxModificationTime { get; set; }

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
        /// Gets or sets the column to order by. Possible values include:
        /// 'Version', 'CreatorUserID', 'AccessorUserID', 'AccessTime',
        /// 'CreationTime', 'ModificationTime'
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
            if (Version > 2147483647)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "Version", 2147483647);
            }
            if (Version < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "Version", 1);
            }
            if (CreatorUserID > 2147483647)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "CreatorUserID", 2147483647);
            }
            if (CreatorUserID < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "CreatorUserID", 1);
            }
            if (AccessorUserID > 2147483647)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "AccessorUserID", 2147483647);
            }
            if (AccessorUserID < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "AccessorUserID", 1);
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
