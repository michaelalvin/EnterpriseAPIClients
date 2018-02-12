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
    /// Model for POST Group input Parameters.
    /// </summary>
    public partial class InsertGroupRequestModel
    {
        /// <summary>
        /// Initializes a new instance of the InsertGroupRequestModel class.
        /// </summary>
        public InsertGroupRequestModel()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the InsertGroupRequestModel class.
        /// </summary>
        /// <param name="name">Gets or sets the name.</param>
        /// <param name="type">Gets or sets the type. Possible values include:
        /// 'Generic', 'Access', 'Role'</param>
        public InsertGroupRequestModel(string name, string type = default(string))
        {
            Name = name;
            Type = type;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the name.
        /// </summary>
        [JsonProperty(PropertyName = "Name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the type. Possible values include: 'Generic',
        /// 'Access', 'Role'
        /// </summary>
        [JsonProperty(PropertyName = "Type")]
        public string Type { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Name == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Name");
            }
        }
    }
}