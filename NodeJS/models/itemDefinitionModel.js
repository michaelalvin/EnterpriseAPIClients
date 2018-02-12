/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Model for template items (drop down values)
 *
 */
class ItemDefinitionModel {
  /**
   * Create a ItemDefinitionModel.
   * @member {string} [id] Gets or sets the identifier.
   * @member {string} name Gets or sets the name.
   * @member {number} value Gets or sets the value.
   * @member {string} type Gets or sets the type. Possible values include:
   * 'Undefined', 'ComboBoxItem', 'ListBoxItem', 'RadioButton',
   * 'ForwardAction', 'ReplyAction'
   */
  constructor() {
  }

  /**
   * Defines the metadata of ItemDefinitionModel
   *
   * @returns {object} metadata of ItemDefinitionModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'ItemDefinitionModel',
      type: {
        name: 'Composite',
        className: 'ItemDefinitionModel',
        modelProperties: {
          id: {
            required: false,
            serializedName: 'ID',
            type: {
              name: 'String'
            }
          },
          name: {
            required: true,
            serializedName: 'Name',
            type: {
              name: 'String'
            }
          },
          value: {
            required: true,
            serializedName: 'Value',
            type: {
              name: 'Number'
            }
          },
          type: {
            required: true,
            serializedName: 'Type',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = ItemDefinitionModel;