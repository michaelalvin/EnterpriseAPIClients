/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * The model that is sent in response to a GET request for Workflow
 *
 */
class WorkflowModel {
  /**
   * Create a WorkflowModel.
   * @member {number} [id] Gets or sets the identifier.
   * @member {string} [name] Gets or sets the name.
   * @member {number} [entityType] Gets or sets the type of the entity.
   * @member {string} [alias] Gets or sets the alias.
   */
  constructor() {
  }

  /**
   * Defines the metadata of WorkflowModel
   *
   * @returns {object} metadata of WorkflowModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'WorkflowModel',
      type: {
        name: 'Composite',
        className: 'WorkflowModel',
        modelProperties: {
          id: {
            required: false,
            serializedName: 'ID',
            type: {
              name: 'Number'
            }
          },
          name: {
            required: false,
            serializedName: 'Name',
            type: {
              name: 'String'
            }
          },
          entityType: {
            required: false,
            serializedName: 'EntityType',
            type: {
              name: 'Number'
            }
          },
          alias: {
            required: false,
            serializedName: 'Alias',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = WorkflowModel;
