# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Softheon.Enterprise.Api.Client
  module Models
    #
    # Model object.
    #
    #
    class LookupField
      # @return [String]
      attr_accessor :column

      # @return [Integer]
      attr_accessor :profile_index

      # @return [Integer]
      attr_accessor :field_index

      # @return [Integer]
      attr_accessor :extension_index


      #
      # Mapper for LookupField class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'LookupField',
          type: {
            name: 'Composite',
            class_name: 'LookupField',
            model_properties: {
              column: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Column',
                type: {
                  name: 'String'
                }
              },
              profile_index: {
                client_side_validation: true,
                required: false,
                serialized_name: 'ProfileIndex',
                type: {
                  name: 'Number'
                }
              },
              field_index: {
                client_side_validation: true,
                required: false,
                serialized_name: 'FieldIndex',
                type: {
                  name: 'Number'
                }
              },
              extension_index: {
                client_side_validation: true,
                required: false,
                serialized_name: 'ExtensionIndex',
                type: {
                  name: 'Number'
                }
              }
            }
          }
        }
      end
    end
  end
end
