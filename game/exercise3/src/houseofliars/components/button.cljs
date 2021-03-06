(ns houseofliars.components.button
  (:require
   [reagent.core :as reagent]
   [houseofliars.state :as state :refer [app-state]]
   [houseofliars.components.message :as message]
   [houseofliars.utils :as utils]))

(defn button-component-did-mount
  "Function that is called every time React renders the target component. Binds an onClick even
to the button which processes the users turn."
  [this]

  ;; Add your code here
)

(defn button-component
  "Renders the button component. Takes an id, which is the id of the candidate.
The id is used to populate the data-attribute candidate-id. This attribute is
used by the button onClick event.

We call reagent/create-class because we need to supply a component-did-mount function
to each button component that is rendered. This fn in called every time react renders
this component on the DOM. This is how we can bind fns to these elements.
"
  [id]
  (reagent/create-class
   {:reagent-render (fn [id]
                      [:button {:className "btn btn-lg default outline liar-button"
                                :data-candidate-id id}
                       "LIAR!"])
    :component-did-mount button-component-did-mount
    }))
