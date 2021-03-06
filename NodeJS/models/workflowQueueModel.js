/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Defines properties and methods for workflow queues
 *
 */
class WorkflowQueueModel {
  /**
   * Create a WorkflowQueueModel.
   * @member {string} [workflowType] Gets or sets the type of the workflow.
   * Possible values include: 'Uncategorized', 'Auto', 'StraightThrough',
   * 'Exception', 'Holding', 'Any'
   * @member {number} [index] Gets or sets the index.
   * @member {number} [subIndex] Gets or sets the subindex.
   * @member {number} [id] Gets or sets the identifier.
   * @member {number} [userCount] Gets or sets the user count.
   * @member {number} [taskCount] Gets or sets the task count.
   * @member {string} [name] Gets or sets the name.
   * @member {string} [alias] Gets or sets the alias.
   * @member {string} [state] Gets or sets the state. Possible values include:
   * 'Inactive', 'Active'
   * @member {string} [type] Gets or sets the type. Possible values include:
   * 'Inbound', 'Outbound', 'Access', 'Any', 'Shared', 'Public', 'Recycle',
   * 'Fax', 'Print', 'Scan', 'Ocr', 'Workflow', 'Schedule', 'System', 'Other',
   * 'CdoInfostore', 'CdoFolder'
   * @member {string} [category] Gets or sets the category.
   * @member {string} [description] Gets or sets the description.
   * @member {number} [reservedInt1] Gets or sets the reserved integer 1.
   * @member {number} [reservedInt2] Gets or sets the reserved integer 2.
   * @member {string} [reservedString1] Gets or sets the reserved string 1.
   * @member {string} [reservedString2] Gets or sets the reserved string 2.
   */
  constructor() {
  }

  /**
   * Defines the metadata of WorkflowQueueModel
   *
   * @returns {object} metadata of WorkflowQueueModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'WorkflowQueueModel',
      type: {
        name: 'Composite',
        className: 'WorkflowQueueModel',
        modelProperties: {
          workflowType: {
            required: false,
            serializedName: 'WorkflowType',
            type: {
              name: 'String'
            }
          },
          index: {
            required: false,
            serializedName: 'Index',
            type: {
              name: 'Number'
            }
          },
          subIndex: {
            required: false,
            serializedName: 'SubIndex',
            type: {
              name: 'Number'
            }
          },
          id: {
            required: false,
            serializedName: 'ID',
            type: {
              name: 'Number'
            }
          },
          userCount: {
            required: false,
            serializedName: 'UserCount',
            type: {
              name: 'Number'
            }
          },
          taskCount: {
            required: false,
            serializedName: 'TaskCount',
            type: {
              name: 'Number'
            }
          },
          name: {
            required: false,
            serializedName: 'Name',
            constraints: {
              MaxLength: 255,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          alias: {
            required: false,
            serializedName: 'Alias',
            constraints: {
              MaxLength: 255,
              MinLength: 0
            },
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
          type: {
            required: false,
            serializedName: 'Type',
            type: {
              name: 'String'
            }
          },
          category: {
            required: false,
            serializedName: 'Category',
            constraints: {
              MaxLength: 255,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          description: {
            required: false,
            serializedName: 'Description',
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
          reservedString1: {
            required: false,
            serializedName: 'ReservedString1',
            constraints: {
              MaxLength: 255,
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
              MaxLength: 255,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = WorkflowQueueModel;
