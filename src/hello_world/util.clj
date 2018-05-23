(ns hello-world.util)

(def row-col-num 5)

(defn randomly-execute-a-fn [f]
  (when (< (rand) 0.5) (f)))

(defn is-game-challenging-enough? [sprites-state]
  (let [{:keys [diagonal-flipped? row-flipped? col-flipped?]} @sprites-state
        true-count (+ (if diagonal-flipped? 1 0)
                      (count (filter val row-flipped?))
                      (count (filter val col-flipped?)))]
    (and (> true-count 3) (< true-count 8))))
