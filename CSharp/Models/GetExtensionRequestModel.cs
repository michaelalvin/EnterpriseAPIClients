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
    /// Model for the GET Extension input parameters
    /// </summary>
    public partial class GetExtensionRequestModel
    {
        /// <summary>
        /// Initializes a new instance of the GetExtensionRequestModel class.
        /// </summary>
        public GetExtensionRequestModel()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the GetExtensionRequestModel class.
        /// </summary>
        /// <param name="drawerID">Gets or sets the drawer identifier.</param>
        /// <param name="entityID">Gets or sets the entity identifier.</param>
        /// <param name="profileID">Gets or sets the profile
        /// identifier.</param>
        /// <param name="id">Gets or sets the extension identifier.</param>
        /// <param name="type">Gets or sets the type of the extension.</param>
        /// <param name="page">Gets or sets the page number.</param>
        /// <param name="pageSize">Gets or sets the size of the page.</param>
        /// <param name="sortOrder">Gets or sets the order. Possible values
        /// include: 'Unspecified', 'Ascending', 'Descending'</param>
        /// <param name="sortBy">Gets or sets the column to order by. Possible
        /// values include: 'RowNumber', 'ID', 'Type', 'String', 'Integer',
        /// 'Double', 'Date'</param>
        public GetExtensionRequestModel(int drawerID, int entityID, int profileID, int? id = default(int?), int? type = default(int?), int? page = default(int?), int? pageSize = default(int?), string sortOrder = default(string), string sortBy = default(string))
        {
            DrawerID = drawerID;
            EntityID = entityID;
            ProfileID = profileID;
            ID = id;
            Type = type;
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
        /// Gets or sets the profile identifier.
        /// </summary>
        [JsonProperty(PropertyName = "ProfileID")]
        public int ProfileID { get; set; }

        /// <summary>
        /// Gets or sets the extension identifier.
        /// </summary>
        [JsonProperty(PropertyName = "ID")]
        public int? ID { get; set; }

        /// <summary>
        /// Gets or sets the type of the extension.
        /// </summary>
        [JsonProperty(PropertyName = "Type")]
        public int? Type { get; set; }

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
        /// 'RowNumber', 'ID', 'Type', 'String', 'Integer', 'Double', 'Date'
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
            if (ProfileID > 2147483647)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "ProfileID", 2147483647);
            }
            if (ProfileID < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "ProfileID", 1);
            }
            if (ID > 2147483647)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "ID", 2147483647);
            }
            if (ID < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "ID", 1);
            }
            if (Type > 2147483647)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "Type", 2147483647);
            }
            if (Type < 0)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "Type", 0);
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