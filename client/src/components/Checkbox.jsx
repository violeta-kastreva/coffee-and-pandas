import React from 'react'

export const Checkbox = (props) => {
    return (
        <div style={{ display: 'flex' }}>
            <input type='checkbox' checked={props.checked} onChange={props.onChange}></input>
            <label>{props.label}</label>
        </div>
    )
}
