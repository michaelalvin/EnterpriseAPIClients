# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Softheon.Enterprise.Api.Client
  module Models
    #
    # Model for Template Profiles
    #
    class ProfileDefinitionModel
      # @return [String] Gets or sets the identifier.
      attr_accessor :id

      # @return [Integer] Gets or sets the type.
      attr_accessor :type

      # @return [String] Gets or sets the name.
      attr_accessor :name

      # @return [String] Gets or sets the reserved string1.
      attr_accessor :reserved_string1

      # @return [Integer] Gets or sets the reserved int1.
      attr_accessor :reserved_int1

      # @return [Array<FieldDefinitionModel>] Gets or sets the fields.
      attr_accessor :fields


      #
      # Mapper for ProfileDefinitionModel class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'ProfileDefinitionModel',
          type: {
            name: 'Composite',
            class_name: 'ProfileDefinitionModel',
            model_properties: {
              id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'ID',
                type: {
                  name: 'String'
                }
              },
              type: {
                client_side_validation: true,
                required: true,
                serialized_name: 'Type',
                constraints: {
                  InclusiveMaximum: 2147483647,
                  InclusiveMinimum: 1
                },
                type: {
                  name: 'Number'
                }
              },
              name: {
                client_side_validation: true,
                required: true,
                serialized_name: 'Name',
                type: {
                  name: 'String'
                }
              },
              reserved_string1: {
                client_side_validation: true,
                required: false,
                serialized_name: 'ReservedString1',
                type: {
                  name: 'String'
                }
              },
              reserved_int1: {
                client_side_validation: true,
                required: false,
                serialized_name: 'ReservedInt1',
                type: {
                  name: 'Number'
                }
              },
              fields: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Fields',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'FieldDefinitionModelElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'FieldDefinitionModel'
                      }
                  }
                }
              }
            }
          }
        }
      end
    end
  end
end
