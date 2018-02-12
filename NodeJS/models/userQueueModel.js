/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * The model that is sent in response to a GET request for UserQueue
 * associations
 *
 */
class UserQueueModel {
  /**
   * Create a UserQueueModel.
   * @member {number} [userID] Gets or sets the user identifier.
   * @member {string} [userFullName] Gets or sets the full name of the user.
   * @member {number} [queueID] Gets or sets the queue identifier.
   * @member {string} [queueName] Gets or sets the name of the queue.
   * @member {number} [acl] Gets or sets the access control level permissions.
   */
  constructor() {
  }

  /**
   * Defines the metadata of UserQueueModel
   *
   * @returns {object} metadata of UserQueueModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'UserQueueModel',
      type: {
        name: 'Composite',
        className: 'UserQueueModel',
        modelProperties: {
          userID: {
            required: false,
            serializedName: 'UserID',
            type: {
              name: 'Number'
            }
          },
          userFullName: {
            required: false,
            serializedName: 'UserFullName',
            constraints: {
              MaxLength: 255,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          queueID: {
            required: false,
            serializedName: 'QueueID',
            type: {
              name: 'Number'
            }
          },
          queueName: {
            required: false,
            serializedName: 'QueueName',
            constraints: {
              MaxLength: 255,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          acl: {
            required: false,
            serializedName: 'Acl',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = UserQueueModel;