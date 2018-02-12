/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * The UserBase Class.
 *
 */
class UserBase {
  /**
   * Create a UserBase.
   * @member {number} [primaryGroupID] Gets or sets the primary group
   * identifier.
   * @member {string} [type] Gets or sets the type. Possible values include:
   * 'ImageDesk', 'PublishDesk', 'FaxDesk', 'CaptureDesk', 'RecognitionDesk',
   * 'PortalUser', 'AdminDesk', 'WorkflowDesk', 'Benchmark', 'ReportDesk',
   * 'ColdDesk', 'PortalDesk', 'WorkflowArchitect', 'DocumentDesk', 'Poweruser'
   * @member {string} [state] Gets or sets the state. Possible values include:
   * 'Active', 'Inactive'
   * @member {string} [fullName] Gets or sets the full name.
   * @member {number} [objectCount] Gets or sets the object count.
   * @member {string} [iPAddress] Gets or sets the ip address.
   * @member {number} [entityAcl] Gets or sets the entity acl.
   * @member {number} [attachmentAcl] Gets or sets the attachment acl.
   * @member {number} [noteAcl] Gets or sets the note acl.
   * @member {number} [entityFeature] Gets or sets the entity feature.
   * @member {number} [attachmentFeature] Gets or sets the attachment feature.
   * @member {number} [noteFeature] Gets or sets the note feature.
   * @member {string} [adminMask] Gets or sets the admin mask. Possible values
   * include: 'None', 'CabinetAdmin', 'DrawerAdmin', 'GroupAdmin', 'UserAdmin',
   * 'WorkflowAdmin', 'VersionAdmin', 'TemplateAdmin', 'ApplicationAdmin'
   * @member {string} [address] Gets or sets the address.
   * @member {number} [reservedInt1] Gets or sets the reserved int1.
   * @member {number} [reservedInt2] Gets or sets the reserved int2.
   * @member {number} [reservedDouble1] Gets or sets the reserved double1.
   * @member {number} [reservedDouble2] Gets or sets the reserved double2.
   * @member {string} [reservedString1] Gets or sets the reserved string1.
   * @member {string} [reservedString2] Gets or sets the reserved string2.
   * @member {date} [userExpiration] Gets or sets the user expiration.
   */
  constructor() {
  }

  /**
   * Defines the metadata of UserBase
   *
   * @returns {object} metadata of UserBase
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'UserBase',
      type: {
        name: 'Composite',
        className: 'UserBase',
        modelProperties: {
          primaryGroupID: {
            required: false,
            serializedName: 'PrimaryGroupID',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 0
            },
            type: {
              name: 'Number'
            }
          },
          type: {
            required: false,
            serializedName: 'Type',
            type: {
              name: 'String'
            }
          },
          state: {
            required: false,
            serializedName: 'State',
            type: {
              name: 'String'
            }
          },
          fullName: {
            required: false,
            serializedName: 'FullName',
            constraints: {
              MaxLength: 255,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          objectCount: {
            required: false,
            serializedName: 'ObjectCount',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 0
            },
            type: {
              name: 'Number'
            }
          },
          iPAddress: {
            required: false,
            serializedName: 'IPAddress',
            constraints: {
              MaxLength: 255,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          entityAcl: {
            required: false,
            serializedName: 'EntityAcl',
            type: {
              name: 'Number'
            }
          },
          attachmentAcl: {
            required: false,
            serializedName: 'AttachmentAcl',
            type: {
              name: 'Number'
            }
          },
          noteAcl: {
            required: false,
            serializedName: 'NoteAcl',
            type: {
              name: 'Number'
            }
          },
          entityFeature: {
            required: false,
            serializedName: 'EntityFeature',
            type: {
              name: 'Number'
            }
          },
          attachmentFeature: {
            required: false,
            serializedName: 'AttachmentFeature',
            type: {
              name: 'Number'
            }
          },
          noteFeature: {
            required: false,
            serializedName: 'NoteFeature',
            type: {
              name: 'Number'
            }
          },
          adminMask: {
            required: false,
            serializedName: 'AdminMask',
            type: {
              name: 'String'
            }
          },
          address: {
            required: false,
            serializedName: 'Address',
            constraints: {
              MaxLength: 255,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          reservedInt1: {
            required: false,
            serializedName: 'ReservedInt1',
            type: {
              name: 'Number'
            }
          },
          reservedInt2: {
            required: false,
            serializedName: 'ReservedInt2',
            type: {
              name: 'Number'
            }
          },
          reservedDouble1: {
            required: false,
            serializedName: 'ReservedDouble1',
            type: {
              name: 'Number'
            }
          },
          reservedDouble2: {
            required: false,
            serializedName: 'ReservedDouble2',
            type: {
              name: 'Number'
            }
          },
          reservedString1: {
            required: false,
            serializedName: 'ReservedString1',
            constraints: {
              MaxLength: 128,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          reservedString2: {
            required: false,
            serializedName: 'ReservedString2',
            constraints: {
              MaxLength: 128,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          userExpiration: {
            required: false,
            serializedName: 'UserExpiration',
            type: {
              name: 'DateTime'
            }
          }
        }
      }
    };
  }
}

module.exports = UserBase;